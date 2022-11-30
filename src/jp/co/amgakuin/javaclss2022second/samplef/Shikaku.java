package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), 100, 100);
		g.fillRect(0, 0, 100, 100);
		g.fillRect(110, 0, 100, 100);
		g.fillRect(220, 0, 100, 100);
		g.fillRect(330, 0, 100, 100);
		g.fillRect(440, 0, 100, 100);
		g.fillRect(0, 300, 100, 100);
		g.fillRect(110, 300, 100, 100);
		g.fillRect(220, 300, 100, 100);
		g.fillRect(330, 300, 100, 100);
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
