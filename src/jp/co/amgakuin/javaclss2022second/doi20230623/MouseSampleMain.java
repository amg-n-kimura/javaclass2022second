package jp.co.amgakuin.javaclss2022second.doi20230623;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
public class MouseSampleMain implements MouseListener,MouseMotionListener {
	
	//乱数用インスタンス
	Random random = new Random();
	
	//描画するオブジェクトの管理用配列
	private ArrayList<DisplayObject> myObjects = new ArrayList<DisplayObject>();
	
	//ゲームコントローラーインスタンス
	private GameController gc = null;
	
	//追加直後のオブジェクト
	private DisplayObject addObject = null;
	
	public void startSample() {
		gc = GameController.gameControllerCreate(640, 480);
		gc.addMouseListener(this);
		gc.addMouseMotionListener(this);
		gc.start();
		
		//MainLoopを起動する
		MainLoop mainLoop = new MainLoop();
		//mainLoop.setDoProcess(false);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MouseSampleMain m = new MouseSampleMain();
		m.startSample();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		//左ボタンでオブジェクト追加
		if (e.getButton() == MouseEvent.BUTTON1) {
			int mouseX = gc.normalizeX(e.getX());
			int mouseY = gc.normalizeY(e.getY());
			addObject = new Shikaku();
			addObject.setX(mouseX);
			addObject.setY(mouseY);
			addObject.setWidth(20);
			addObject.setHeight(20);
			addObject.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(addObject);
			myObjects.add(addObject);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
		}
	}
	
	//重なっている四角のインデックスを返す
	private int checkOval(int positionX,int positionY) {
		//for(GameControllerObject object:myObjects) {
		for(int i=0; i<myObjects.size(); i++) {
			if(myObjects.get(i).getRect().contains(positionX, positionY)) {
				return i;
			}
		}
		return -1;
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
	@Override
	public void mouseMoved(MouseEvent e) {

	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		addObject.setX(e.getX());
		addObject.setY(e.getY());
		System.out.println(e.getY());
	}

}
