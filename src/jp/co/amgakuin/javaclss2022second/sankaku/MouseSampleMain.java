package jp.co.amgakuin.javaclss2022second.sankaku;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import jp.co.amgakuin.javaclss2022second.framework.GameController;

/**
 * マウスで四角を描画する
 * @author rf-nobuyuki-kimura
 *
 *必須事項
 *	MouseListenerの実装
 *	描画する四角（描画オブジェクト）を管理する
 */
public class MouseSampleMain implements MouseListener {
	

	//[5][4]の配列がほしい
	//行列
	//	行と列
	//		5行4列
	//	1 2 3 4
	//	1 2 3 4
	//	1 2 3 4
	//	1 2 3 4
	//	1 2 3 4
	int array2d[][];// = new int[5][4];
	
	void setUpArray2d() {
		array2d = new int[5][4];
		for(int row=0; row<5; row++) {
			for(int col=0; col<4; col++) {
				array2d[row][col] = col + 1;
			}
		}
		System.out.println(array2d.length);
		System.out.println(array2d[0].length);
	}	
	
	//乱数用インスタンス
	Random random = new Random();
	
	//描画するオブジェクトの管理用配列
	private ArrayList<DisplayObject> myObjects = new ArrayList<DisplayObject>();
	
	//ゲームコントローラーインスタンス
	private GameController gc = null;
	
	public void startSample() {
		gc = GameController.gameControllerCreate(640, 480);
		gc.addMouseListener(this);
		gc.start();
		
		//MainLoopを起動する
		//MainLoop mainLoop = new MainLoop();
		//mainLoop.setDoProcess(false);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MouseSampleMain m = new MouseSampleMain();
		m.startSample();
		//m.setUpArray2d();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		//左ボタンで円追加
		if (e.getButton() == MouseEvent.BUTTON1) {
			int mouseX = gc.normalizeX(e.getX());
			int mouseY = gc.normalizeY(e.getY());
			
			//全オブジェクトに対して、衝突判定チェックを行う

			Oval s = new Oval();
			s.setX(mouseX);
			s.setY(mouseY);
			s.setWidth(20);
			s.setHeight(20);
			s.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(s);
			if (s != null) {
				myObjects.add(s);
				System.out.println("丸追加");
			}
		} else if (e.getButton() == MouseEvent.BUTTON2) {
			//右ボタンで線を引く
			int mouseX = gc.normalizeX(e.getX());
			int mouseY = gc.normalizeY(e.getY());
			Line l = new Line();
			l.setX(mouseX);
			l.setY(mouseY);
			l.setWidth(30);
			l.setHeight(30);
			l.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(l);
			myObjects.add(l);
			System.out.println("ライン追加");
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			//ホイールボタンで古いオブジェクトを削除
			if (!myObjects.isEmpty()) {
				gc.removeObject(myObjects.remove(0));
				System.out.println("オブジェクト削除");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
