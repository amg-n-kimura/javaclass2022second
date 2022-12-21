package jp.co.amgakuin.javaclss2022second.framework;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Shikaku extends DisplayObject {

	private Random ran=new Random();
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		
		g.setColor(getColor());
		g.fillRect(getX(),getY(),getWidth(),getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		int r,g,b;
		r=ran.nextInt(256);
		g=ran.nextInt(256);
		b=ran.nextInt(256);
		setColor(new Color(r,g,b));
		setX(ran.nextInt(200));
		setY(ran.nextInt(200));
		setWidth(100);
		setHeight(100);
		
		setInitialized(true);

	}

}
