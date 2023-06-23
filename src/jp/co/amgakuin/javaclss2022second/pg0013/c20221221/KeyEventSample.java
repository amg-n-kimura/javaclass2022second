package jp.co.amgakuin.javaclss2022second.pg0013.c20221221;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.pg0013.c20230526.Shikaku;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	static private Shikaku shikaku;
	
	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		shikaku = new Shikaku();
		KeyEventSample.setShikaku(shikaku);
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.addKeyListener(key);
		gc.addObject(shikaku);
		gc.start();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		int x = shikaku.getX();
		int y = shikaku.getY();
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		
		shikaku.setX(x);
		shikaku.setY(y);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
