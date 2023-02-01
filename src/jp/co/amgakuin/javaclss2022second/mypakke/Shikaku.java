package jp.co.amgakuin.javaclss2022second.mypakke;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * 四角を描画するクラス
 * @author rf-nobuyuki-kimura
 *
 */
public class Shikaku extends DisplayObject {

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

	}

}
