package jp.co.amgakuin.javaclss2022second.kimura20230125;

import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class SampleFramework {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.start();
	}

}
