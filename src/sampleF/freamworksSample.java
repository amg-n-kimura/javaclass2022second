package sampleF;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.sample20221130.Shikaku;

public class freamworksSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.start();
		for(int i =0;i<10;i++) {
		gc.addObject(new Shikaku());
		}
		
	}
}