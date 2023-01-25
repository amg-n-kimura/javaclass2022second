package jp.co.amgakuin.javaclss2022second.sanplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {
	int posX[] = new int[10], posY[] = new int[10], waitTime, start = 0;
	Random random = new Random();
	int move=0;
	//何か追加
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		if(posX[0]>=540) {move=1;}
		if(posX[0]<=0) {move=0;}
		if(move==0) {
			posX[0] += 1;
		}
		if(move==1) {
			posX[0] -= 1;
		}
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		
		g.setColor(Color.GREEN);
		for(int i = 0; i < 10; i++)
		{
			g.fillRect(posX[i], posY[i], 100, 100);
		}
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		if(start == 0)
		{
			for(int i = 0; i < 10; i++)
			{
				posX[i] = random.nextInt(540);
				posY[i] = random.nextInt(380);
			}
			start++;
		}

	}

}
