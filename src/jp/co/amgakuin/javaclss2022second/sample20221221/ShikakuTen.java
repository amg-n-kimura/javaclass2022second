package jp.co.amgakuin.javaclss2022second.sample20221221;

import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class ShikakuTen {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shikaku arr[] = new Shikaku[10];
		for(int i=0; i<10; i++) {
			arr[i] = new Shikaku();
		}
		GameController gc = GameController.gameControllerCreate(640, 480);
		for(int i=0; i<10; i++) {
			gc.addObject(arr[i]);
		}
		gc.start();
	}

}
