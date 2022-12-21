package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample implements KeyListener {
	@Setter
	static private Shikaku shikaku;
	
	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		shikaku=new Shikaku();
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
		int x =shikaku.getX();
		int y =shikaku.getY();
		int speed=10; 
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x+=speed;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			y-=speed;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y+=speed;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x-=speed;
		}
		if(x<=0) {x=0;}
		if(y>=380) {y=380;}
		if(y<=0) {y=0;}
		if(x>=540) {x=540;}
		shikaku.setX(x);
		shikaku.setY(y);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
