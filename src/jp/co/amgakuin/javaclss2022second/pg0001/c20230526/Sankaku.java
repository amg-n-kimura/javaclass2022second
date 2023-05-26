package jp.co.amgakuin.javaclss2022second.pg0001.c20230526;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * 四角を描画するクラス
 * @author rf-nobuyuki-kimura
 *
 */
public class Sankaku extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		//g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawLine(getX(), getY(), getX() + getWidth(), getY());
		g.drawLine(getX(), getY(), getX(), getY() + getHeight());
		g.drawLine(getX(), getY() + getHeight(), getX() + getWidth(), getY());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
