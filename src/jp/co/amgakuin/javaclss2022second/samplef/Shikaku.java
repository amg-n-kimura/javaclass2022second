package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {
	
	@Override
	public boolean update() {
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.fillRect(getX(), getY(),100 , 100);
	}
	
	@Override
	public void initialize() {
		//ランダムで初期座標決定
		Random random =new Random();
		setX(random.nextInt(640));
		setY(random.nextInt(480));
		
		//ランダムで色決定
		int r,g,b;
		r=random.nextInt(256);
		g=random.nextInt(256);
		b=random.nextInt(256);
		setColor(new Color(r,g,b));
		
		initialized =true;
	}

}
