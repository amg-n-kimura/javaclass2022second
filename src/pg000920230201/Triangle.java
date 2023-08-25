package pg000920230201;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * 四角を描画するクラス
 * @author rf-nobuyuki-kimura
 *
 */
public class Triangle extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		int px=getX();
		int py=getY();
		
		g.drawLine(px+(Math.sqrt(3)/2),py,px-50,py-);//fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawLine();//fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawLine();//fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
