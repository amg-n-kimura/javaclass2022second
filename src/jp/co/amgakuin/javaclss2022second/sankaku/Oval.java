package jp.co.amgakuin.javaclss2022second.sankaku;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Oval extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.fillOval(getX(), getY(), getWidth(), getHeight());
		//g.drawOval(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
