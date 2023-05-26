package jp.co.amgakuin.javaclss2022second.sankaku;

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
		int xPoints[] = new int[3];
		int yPoints[] = new int[3];
		xPoints[0] = getX();
		xPoints[1] = getX()-getWidth()/2;
		xPoints[2] = getX()+getWidth()/2;
		yPoints[0] = getY()-getHeight()/2;
		yPoints[1] = getY()+getHeight()/2;
		yPoints[2] = getY()+getHeight()/2;

		
		g.fillPolygon(xPoints, yPoints, 3);
		//g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
