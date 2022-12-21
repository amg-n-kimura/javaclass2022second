/**
 * 四角オブジェクト
 */
package jp.co.amgakuin.javaclss2022second.sample20221221key;

import java.awt.Color;
import java.awt.Graphics;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {
	int X = getX();
	int Y = getY();
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
		g.fillRect(X,Y,getWidth(),getHeight());
		
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		//初期位置の設定
		setX(100);
		setY(100);
		setWidth(100);
		setHeight(100);
		//色の設定
		setColor(Color.RED);
		//初期化完了フラグ
		setInitialized(true);
	}

}
