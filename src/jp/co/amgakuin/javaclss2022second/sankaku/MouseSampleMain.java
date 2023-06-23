package jp.co.amgakuin.javaclss2022second.sankaku;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.framework.GameControllerObject;

/**
 * マウスで四角を描画する
 * @author rf-nobuyuki-kimura
 *
 *必須事項
 *	MouseListenerの実装
 *	描画する四角（描画オブジェクト）を管理する
 */
public class MouseSampleMain implements MouseListener {
	
	//乱数用インスタンス
	Random random = new Random();
	
	//描画するオブジェクトの管理用配列
	private ArrayList<GameControllerObject> myObjects = new ArrayList<GameControllerObject>();
	
	//ゲームコントローラーインスタンス
	private GameController gc = null;
	
	public void startSample() {
		gc = GameController.gameControllerCreate(640, 480);
		gc.addMouseListener(this);
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
			Oval o=new Oval();
			o.setX(mouseX);
			o.setY(mouseY);
			o.setWidth(20);
			o.setHeight(20);
			o.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(o);
			myObjects.add(o);
			System.out.println("〇追加");
			
		} else if (e.getButton() == MouseEvent.BUTTON2) {
			int mouseX = gc.normalizeX(e.getX());
			int mouseY = gc.normalizeY(e.getY());
			Line l = new Line();
			l.setX(mouseX);
			l.setY(mouseY);
			l.setWidth(20);
			l.setHeight(20);
			l.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(l);
			myObjects.add(l);
			System.out.println("線追加");
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			//左ボタンで古いオブジェクトを削除
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
