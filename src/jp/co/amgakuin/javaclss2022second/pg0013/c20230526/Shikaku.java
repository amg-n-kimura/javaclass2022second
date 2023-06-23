/**
 * 四角オブジェクト
 */
package jp.co.amgakuin.javaclss2022second.pg0013.c20230526;

import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		//指定された色で描画
		g.setColor(getColor());
		g.fillRect(getX(),getY(),getWidth(),getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		//初期位置の設定
	}

}
