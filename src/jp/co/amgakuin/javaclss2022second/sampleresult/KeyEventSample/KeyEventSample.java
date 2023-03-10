package jp.co.amgakuin.javaclss2022second.sampleresult.KeyEventSample;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Getter;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	@Getter
	private Shikaku shikaku;
	
	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		key.setShikaku(new Shikaku());
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.addKeyListener(key);
		gc.addObject(key.getShikaku());
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
			getShikaku().setX(getShikaku().getX() + 1);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			getShikaku().setX(getShikaku().getX() - 1);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			getShikaku().setX(getShikaku().getX() - 1);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			getShikaku().setX(getShikaku().getX() + 1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
