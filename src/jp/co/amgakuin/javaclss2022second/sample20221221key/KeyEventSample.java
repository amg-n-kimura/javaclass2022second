package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import jp.co.amgakuin.javaclss2022second.framework.GameController;
import lombok.Setter;

public class KeyEventSample extends DisplayObject implements KeyListener {
	@Setter
	private Shikaku shikaku;

	public static void main(String[] args) {
		KeyEventSample key = new KeyEventSample();
		key.setShikaku(new Shikaku());
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.addObject(key);
		gc.addKeyListener(key);
		gc.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void keyPressed(KeyEvent e) {
		shikaku.setMoveX(0);
		shikaku.setMoveY(0);
		// TODO 自動生成されたメソッド・スタブ
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("右p");
			shikaku.setMoveX( 1);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("左p");
			shikaku.setMoveX( - 1);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("上p");
			shikaku.setMoveY( - 1);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("下p");
			shikaku.setMoveY( 1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public boolean update() {
		shikaku.update();
		return false;
	}

	@Override
	public void draw(Graphics g) {
		shikaku.draw(g);
	}

	@Override
	public void initialize() {
		shikaku.initialize();
		setInitialized(true);
	}

}
