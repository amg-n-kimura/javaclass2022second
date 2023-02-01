package pg000920230201;

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
		gc = GameController.gameControllerCreate(1920, 480);
		gc.addMouseListener(this);
		gc.start();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MouseSampleMain m = new MouseSampleMain();
		m.startSample();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		/** 左ボタンオブジェ追加 */
		if(e.getButton()==MouseEvent.BUTTON1) {
		 int mouseX = gc.normalizeX(e.getX());
		 int mouseY = gc.normalizeY(e.getY());
		 Shikaku s = new Shikaku();
		 s.setX(mouseX);
		 s.setY(mouseY);
		 s.setWidth(100);
		 s.setHeight(100);
		 s.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),255));
		 gc.addObject(s);
		myObjects.add(s);
		}else if(e.getButton()==MouseEvent.BUTTON2) {
			/** 右で最初のオブジェクト削除 */
			if(!myObjects.isEmpty()) {
				gc.removeObject(myObjects.remove(0));
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
