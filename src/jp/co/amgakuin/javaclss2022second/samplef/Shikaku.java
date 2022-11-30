package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import jp.co.amgakuin.javaclss2022second.framework.GameController;


public class Shikaku extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
		
	}

	@Override
	public void draw(Graphics g) {
		Random random = new Random();
		//0〜9までの乱数
			random.nextInt(10);

		// TODO 自動生成されたメソッド・スタブ
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 100, 100);

	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
				GameController gc = GameController.gameControllerCreate(640, 480);
				gc.start();
				gc.addObject(new Shikaku());

	}

}
