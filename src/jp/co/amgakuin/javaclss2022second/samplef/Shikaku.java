package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {
	public int cnt;
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		cnt++;
		if(cnt == 10) {
			cnt = 0;
			setX(getX() + 1);
			setY(getY() + 1);
		}
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ

		g.setColor(Color.GREEN);
		g.fillRect(getX(),getY(), 50, 50);
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		setX(random.nextInt(5) * 100);
		setY(random.nextInt(5) * 100);
		initialized = true;
	}
}