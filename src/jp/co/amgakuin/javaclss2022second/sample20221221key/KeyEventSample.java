package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	private Shikaku shikaku;
	int x,y;
	
	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		key.setShikaku(new Shikaku());
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.addKeyListener(key);
		gc.start();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		x = shikaku.getX();
		y = shikaku.getY();
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			//shikaku.setX(++x);
			System.out.println("右");
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			shikaku.setX(--x);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			shikaku.setY(++y);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			shikaku.setY(--y);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
