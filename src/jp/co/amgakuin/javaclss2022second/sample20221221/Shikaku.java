package jp.co.amgakuin.javaclss2022second.sample20221221;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {

	private Random rnd = new Random();
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		int r,g,b;
		r = rnd.nextInt(256);
		g = rnd.nextInt(256);
		b = rnd.nextInt(256);
		setColor(new Color(r,g,b));
		setX(rnd.nextInt(200)+50);
		setY(rnd.nextInt(200)+50);
		setWidth(100);
		setHeight(100);
		
		setInitialized(true);
	}

}
