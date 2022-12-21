package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	private static Shikaku shikaku;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		key.setShikaku(new Shikaku());
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
		int oldx = shikaku.getX();
		int oldy = shikaku.getY();
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			int X = shikaku.getX();
			X += 10;
			shikaku.setX(X);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			int X = shikaku.getX();
			X -= 10;
			shikaku.setX(X);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			int Y = shikaku.getY();
			Y -= 10;
			shikaku.setY(Y);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			int Y = shikaku.getY();
			Y += 10;
			shikaku.setY(Y);
		}
		int x, y;
		x = shikaku.getX();
		y = shikaku.getY();
		if(x < 0 || x > 540 || y < 0 || y > 380) {
			shikaku.setX(oldx);
			shikaku.setY(oldy);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
