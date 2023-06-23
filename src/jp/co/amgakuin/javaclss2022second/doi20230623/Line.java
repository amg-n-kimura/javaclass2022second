/**
 * 
 */
package jp.co.amgakuin.javaclss2022second.doi20230623;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * @author syotaro
 *
 */
public class Line extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.drawLine(getX(), getY(),getX() + getWidth(), getY() + getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
