package jp.co.amgakuin.javaclss2022second.sample20230125;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class MouseSample implements MouseListener {

	public static void main(String[] args) {
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.start();
		gc.addMouseListener(new MouseSample());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("クリックされました。");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("押されました。");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("はなされました。");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("入りました。");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("出ていきました。");
	}
}
