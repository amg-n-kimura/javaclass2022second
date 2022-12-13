package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

public class Shikaku extends DisplayObject {

    
	public int min=0;
	public int max=0;
   

    public Shikaku() {
    	
    	 Random ran=new Random();
    	 min=ran.nextInt(400);
 		 max=ran.nextInt(300);

    }
    
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		
		this.min++;
		this.max++;

		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ

		
		g.setColor(Color.GREEN);
		g.fillRect(this.min,this.max,100,100);

	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

		

	}

}


