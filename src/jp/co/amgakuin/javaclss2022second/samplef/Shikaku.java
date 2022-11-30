package jp.co.amgakuin.javaclss2022second.samplef;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;
import lombok.Setter;

public class Shikaku extends DisplayObject {
    @Setter
	private boolean moveFlag=false;
    private boolean left =false;
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		if(!moveFlag) {
			return false;
		}
		if(left) {
			setX(getX()-1);
		}else {
			setX(getX()+1);
		}
		if(getX()>640) {
			left =true;
		}
		if(getX()<0) {
			left =false;
		}
		
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(),100 , 100);
	}
	
	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ
		Random random =new Random();
		setX(random.nextInt(640));
		setY(random.nextInt(480));
		initialized =true;
	}

}
