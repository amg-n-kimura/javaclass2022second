package jp.co.amgakuin.javaclss2022second.doi20230623;

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
			//既に四角があれば追加しない
			if(checkOval(mouseX,mouseY)!=-1) {
				return;
			}
			Shikaku shikaku = new Shikaku();
			shikaku.setX(mouseX);
			shikaku.setY(mouseY);
			shikaku.setWidth(20);
			shikaku.setHeight(20);
			shikaku.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
			gc.addObject(shikaku);
			myObjects.add(shikaku);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			int mouseX = gc.normalizeX(e.getX());
			int mouseY = gc.normalizeY(e.getY());
			//四角があれば削除
			int overlapIndex = checkOval(mouseX,mouseY);
			if(overlapIndex ==-1) {
				return;
			}
			gc.removeObject(myObjects.get(overlapIndex));
			myObjects.remove(overlapIndex);
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

}
