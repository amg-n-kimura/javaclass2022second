package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class sikaku extends DisplayObject {
	int posX[] = new int[10], posY[] = new int[10], waitTime, start = 0;
	Random random = new Random();
	
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		if(waitTime == 0)
		{
			posX[0] = random.nextInt(540);
			posY[0] = random.nextInt(380);
			
			waitTime = 7;
		}
		else {waitTime--;}
		
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
