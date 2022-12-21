package jp.co.amgakuin.javaclss2022second.sampleresult.shikaku;

import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class ShikakuSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.addObject(new Shikaku());
		gc.start();
	}

}
