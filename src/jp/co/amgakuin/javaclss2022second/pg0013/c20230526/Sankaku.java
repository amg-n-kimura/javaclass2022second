package jp.co.amgakuin.javaclss2022second.pg0013.c20230526;

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
		int[] x = {getX(),getX() - getWidth() / 2,getX() + getWidth() / 2};
		int[] y = {getY(), getY() + getHeight(),getY() + getHeight()};
		g.fillPolygon(x, y,3);
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
