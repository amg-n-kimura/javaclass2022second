package jp.co.amgakuin.javaclss2022second.sankaku;

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
        int[] xPoints = {getX(), getX() - 100 / 2, getX() + 100 / 2};
        int[] yPoints = {getY() - 100, getY() + 100, getY() + 100};
        int nPoints = 3;

        g.fillPolygon(xPoints, yPoints, nPoints);

	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
