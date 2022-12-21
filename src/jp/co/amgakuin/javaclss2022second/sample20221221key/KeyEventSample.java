package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	public static Shikaku shikaku;
	
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
		int spd=30;
		int oldx=shikaku.getX();//動く前の資格の位置を保存
		int oldy=shikaku.getY();
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("右");
			shikaku.setX(shikaku.getX()+spd);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("左");
			shikaku.setX(shikaku.getX()-spd);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("上");
			shikaku.setY(shikaku.getY()-spd);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("下");
			shikaku.setY(shikaku.getY()+spd);
		}
		int x,y;//動いた後の四角の位置
		x=shikaku.getX();
		y=shikaku.getY();
		if(x<0||x>540||y<0||y>380) {//範囲外からでたら保存した位置に戻す
			shikaku.setX(oldx);
			shikaku.setY(oldy);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
