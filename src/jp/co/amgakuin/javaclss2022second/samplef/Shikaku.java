package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject  {

	public int x[] = new int [10];
	public int y[] = new int [10];
	public int _posX = 0;
	public int _posY = 0;
	public int _speed;
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		    _posX++;
		    _posY++;
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(Color.GREEN);
		for(int i = 0; i < 10; i++) {
		g.fillRect(x[i], y[i], 100, 100);
		}
		g.fillRect(_posX, _posY, 100, 100);
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 10; i++) {
		Random random = new Random();
		//0〜4までの乱数
		x[i] = random.nextInt(540);
		y[i] = random.nextInt(380);
		}
		initialized = true;
	}


}
