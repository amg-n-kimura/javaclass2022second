package jp.co.amgakuin.javaclss2022second.framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.JFrame;

import lombok.Getter;

/**
 * ゲーム画面制御用コントローラー
 *
 * @author kimura
 */
public class GameController extends JFrame implements Runnable {

	@Getter
	private boolean isGameEnd = false;
	private boolean interrupted = false;

	private Boolean painting = false;
	private boolean firstDrawing;

	private int screenWidth;
	private int screenHeight;
	private Image offScreen;
	private Graphics offScreenGraphics = null;

	private Color bgColor;

	@Getter
	private int translateX = 0;
	@Getter
	private int translateY = 0;

	private List<GameControllerObject> objectsList = Collections
			.synchronizedList(new LinkedList<GameControllerObject>());

	private class CmdPacket {
		final static int ADD_OBJECT = 1;
		final static int REMOVE_OBJECT = 2;
		int cmd;
		GameControllerObject obj;

		CmdPacket(int c, GameControllerObject o) {
			this.cmd = c;
			this.obj = o;
		}
	}

	private Queue<CmdPacket> commandPacketQueue = new ConcurrentLinkedQueue<>();

	private Thread myThread;
	private IGameControllerCallback callback = null;

	/**
	 * ゲームコントローラーインスタンスを生成して返します。オフスクリーンは自動生成される。
	 * 
	 * @param width    画面幅（ピクセル数）
	 * @param height   画面高さ（ピクセル数）
	 * @return {@link GameController}インスタンス
	 */
	public static GameController gameControllerCreate(int width, int height) {
		return new GameController(width, height, null);
	}
	
	public static GameController gameControllerCreate(int width, int height, IGameControllerCallback callback) {
		return new GameController(width, height, callback);
	}

	/**
	 * 画面を初期化し、インスタンスを返す
	 *
	 * @param width  画面の幅
	 * @param height 画面の高さ
	 */
	private GameController(int width, int height, IGameControllerCallback callback) {
		this.callback = callback;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		this.bgColor = Color.WHITE;
		this.screenWidth = width;
		this.screenHeight = height;
		this.offScreen = createImage(width, height);//new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		this.firstDrawing = true;
		myThread = new Thread(this);
	}

	/**
	 * オフスクリーンの指定。
	 * <p>
	 * 新たにオフスクリーンを設定したい場合に呼び出す
	 *
	 * @param offScreen 設定する{@link BufferedImage オフスクリーン}
	 */
	public void setOffScreen(BufferedImage offScreen) {
		this.offScreen = offScreen;
	}

	/**
	 * 処理対象オブジェクトの登録
	 *
	 * @param object 登録するオブジェクトインスタンス。{@link GameControllerObject}インターフェースを実装していること。
	 */
	public void addObject(GameControllerObject object) {
		requestAddObject(object);
	}

	/**
	 * コマンド処理キューにオブジェクト追加処理を追加する
	 * 
	 * @param object
	 */
	private void requestAddObject(GameControllerObject object) {
		synchronized (commandPacketQueue) {
			commandPacketQueue.add(new CmdPacket(CmdPacket.ADD_OBJECT, object));
		}
	}

	/**
	 * 処理対象からオブジェクトを削除する
	 *
	 * @param object 削除するオブジェクトインスタンス。
	 */
	public void removeObject(GameControllerObject object) {
		requestRemoveObject(object);
	}

	/**
	 * コマンド処理キューにオブジェクト削除処理を追加する
	 * 
	 * @param object
	 */
	private void requestRemoveObject(GameControllerObject object) {
		synchronized (commandPacketQueue) {
			commandPacketQueue.add(new CmdPacket(CmdPacket.REMOVE_OBJECT, object));
		}
	}

	/**
	 * メインループを中断して終了させる
	 */
	public void interrupte() {
		isGameEnd = true;
		interrupted = true;
		myThread.interrupt();
	}

	/**
	 * オフスクリーンの背景色指定
	 *
	 * @param color {@link Color}
	 */
	public void setBgColor(Color color) {
		bgColor = color;
	}

	/**
	 * オフスクリーンの{@link Graphics}クラス取得
	 *
	 * @return {@link Graphics}
	 */
	public Graphics getOffScreenGraphics() {
		if (offScreenGraphics == null && offScreen != null) {
			offScreenGraphics = offScreen.getGraphics();
		}
		return offScreenGraphics;
	}

	/**
	 * ウィンドウＸ座標をオフスクリーン座標に変換する。
	 *
	 * @param x ウィンドウ座標
	 * @return オフスクリーン座標
	 */
	public int normalizeX(int x) {
		return x - translateX;
	}

	/**
	 * ウィンドウＹ座標をオフスクリーン座標に変換する。
	 *
	 * @param y ウィンドウ座標
	 * @return オフスクリーン座標
	 */
	public int normalizeY(int y) {
		return y - translateY;
	}

	/**
	 * ゲームコントローラーを開始する
	 */
	public void start() {
		myThread.start();
	}

	/**
	 * オブジェクトの更新
	 */
	private void updateAll() {
		// 全オブジェクトの更新
		boolean end = true;
		for (GameControllerObject obj : objectsList) {
			// 必要なら初期化処理を呼び出す
			if (!obj.initialized) {
				obj.initialize();
			}
			end &= obj.update();
		}

		if (objectsList.size() == 0) {
			isGameEnd = false;
		} else {
			isGameEnd = end;
		}
	}

	/**
	 * オブジェクト描画処理
	 * 
	 * @param g {@link Graphics}コンテキスト
	 */
	private void drawAll(Graphics g) {
		g.setColor(bgColor);
		g.fillRect(0, 0, screenWidth, screenHeight);
		// 全オブジェクトの描画
		objectsList.forEach(i -> {
			i.draw(g);
		});
	}

	private void processRequest() {
		synchronized (commandPacketQueue) {
			commandPacketQueue.forEach(action -> {
				if (action.cmd == CmdPacket.ADD_OBJECT) {
					objectsList.add(action.obj);
				} else if (action.cmd == CmdPacket.REMOVE_OBJECT) {
					objectsList.remove(action.obj);
				}
			});
			commandPacketQueue.clear();
		}
	}

	/**
	 * ゲーム制御メインルーチン
	 * <p>
	 * オブジェクトの更新処理呼び出し
	 * <p>
	 * オフスクリーンにオブジェクトを表示処理呼び出し
	 */
	@Override
	public void run() {

		try {
			if (callback != null) {
				callback.gameControllerCallback(IGameControllerCallback.STATE_INITIALIZED);
			}
			while (!isGameEnd && !interrupted) {
				if (offScreen == null) {
					continue;
				}

				// オブジェクトの追加・削除処理
				processRequest();

				// 全オブジェクトの更新
				updateAll();

				// 描画処理
				Graphics g = getOffScreenGraphics();
				drawAll(g);

				repaint();
				Thread.sleep(16);

			}

		} catch (Exception e) {
		}

		this.dispose();
	}

	/**
	 * ＯＳからのウィンドウ描画呼び出し
	 * <p>
	 * 初期描画時にオフスクリーンのオフセット座標を算出して記録している
	 */
	@Override
	public void paint(Graphics g) {
		synchronized (painting) {
			painting = true;
			if (firstDrawing) {
				Insets in = getInsets();
				translateX = in.left;
				translateY = in.top;
				firstDrawing = false;
				setSize(screenWidth + in.left + in.right, screenHeight + in.top + in.bottom);
			}
			g.translate(translateX, translateY);

			g.drawImage(offScreen, 0, 0, this);
			painting = false;
		}
	}
}
