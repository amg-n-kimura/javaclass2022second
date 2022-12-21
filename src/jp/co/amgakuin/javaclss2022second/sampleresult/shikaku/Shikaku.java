/**
 * 四角オブジェクト
 */
package jp.co.amgakuin.javaclss2022second.sampleresult.shikaku;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {

	//30フレームをインターバルとする
	private final static int INTERVAL = 30;
	//フレームカウンター
	private int interval = 0;
	//乱数インスタンス
	private Random rnd = new Random();
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		if (interval++ >= INTERVAL) {
			interval = 0;
			//30フレームごとに移動させる
			setX(rnd.nextInt(100));
			setY(rnd.nextInt(100));
		}
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
		setX(100);
		setY(100);
		setWidth(100);
		setHeight(100);
		//色の設定
		int r,g,b;
		r=rnd.nextInt(256);
		g=rnd.nextInt(256);
		b=rnd.nextInt(256);
		setColor(new Color(r,g,b));
		//初期化完了フラグ
		setInitialized(true);
	}

}
