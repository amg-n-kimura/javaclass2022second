package kadai0201;

import java.awt.Graphics;
import java.util.Random;

import jp.co.amgakuin.javaclss2022second.framework.DisplayObject;

/**
 * 四角を描画するクラス
 * @author rf-nobuyuki-kimura
 *
 */
public class Shikaku extends DisplayObject {

	@Override
	public boolean update() {
		// TODO 自動生成されたメソッド・スタブ

		//置いた位置で動く方向変える
		
		if(getY() < H / 2 - size) {
			y -= 1;
		}
        if(getY() > H / 2 + size) {
			y += 1;
		}
        if(getX() < W / 2 - size) {
        	x -= 1;
        }
        if(getX() > W / 2 + size) {
        	x += 1;
        }
		
        if(x==0&&y==0) {
        	down=true;
        }
        
        if(down==true) {
        	y-=10;
        }
        
		return false;
	}

	@Override
	public void draw(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		g.setColor(getColor());
		g.fillRect(getX()+x, getY()+y, getWidth(), getHeight());
	}

	@Override
	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}
	
	Random random = new Random();
	private int x=0;
	private int y=0;
	//画面の縦横
	private int W=640;
	private int H=480;
	//四角のサイズ
	private int size=20;
	private boolean down=false;
}
