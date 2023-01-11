package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	private static Shikaku shikaku;
	
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
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("右");
			//setShikaku(shikaku.getX() + 10);
			shikaku.setX(shikaku.getX() + 10);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("左");
			shikaku.setX(shikaku.getX() - 10);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("上");
			shikaku.setY(shikaku.getY() - 10);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("下");
			shikaku.setY(shikaku.getY() + 10);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
