package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikakuf extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		++cnt;
		Random random = new Random();
		if(cnt%120==0) {
			x=random.nextInt(600);
			y=random.nextInt(400);
		}
		
		if(x>=600||x<=0) {spdx*=-1;}
		if(y>=400||y<=0) {spdy*=-1;}
		x+=spdx;
		y+=spdy;
				
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 100, 100);

	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
	}
	Random random = new Random();
	public int x=random.nextInt(600);
	public int y=random.nextInt(400);
	public int cnt;
	public int spdx=3;
	public int spdy=3;
}
