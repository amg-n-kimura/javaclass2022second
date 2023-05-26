package javaclass2022second.sankaku;

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

	public void drawTriangle( Graphics g, int gx, int gy, int a ) {
		int x1,y1,x2,y2,x3,y3;
		double h;
		double l = (double)a;
		h = Math.sqrt(l * l - (l / 2.0) * (l / 2.0));
		x1 = gx;
		y1 = (int)((double)gy - h * 2.0/3.0);
		
		x2 = (int)((double)gx - l / 2.0);
		y2 = (int)((double)gy + h * 1.0 / 3.0);
		
		x3 = (int)((double)gy + l / 2.0);
		y3 = y2;
		
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		
		g.setColor(getColor());
		//g.fillRect(getX(), getY(), getWidth(), getHeight());
	   drawTriangle(g, getX(), getY(), 100);
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
