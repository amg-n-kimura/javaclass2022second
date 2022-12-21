package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.samplef.Shikaku;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	private Shikaku shikaku;
	
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
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			shikaku.X += 1;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		    shikaku.X -= 1;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			shikaku.Y -= 1;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			shikaku.Y += 1;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
