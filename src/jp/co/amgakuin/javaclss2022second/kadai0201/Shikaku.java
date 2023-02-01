package jp.co.amgakuin.javaclss2022second.kadai0201;

import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * 四角を描画するクラス
 * @author rf-nobuyuki-kimura
 *
 */
public class Shikaku extends DisplayObject {

	//乱数用インスタンス
	Random random = new Random();
	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ
		int insNum = random.nextInt(4);
		if(insNum == 0)
		{
			setX(getX() + 2);
		}
		else if(insNum == 1)
		{
			setX(getX() - 2);
		}
		else if(insNum == 2)
		{
			setY(getY() + 2);	
		}
		else if(insNum == 3)
		{
			setY(getY() - 2);	
		}
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
