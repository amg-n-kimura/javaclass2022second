package jp.co.amgakuin.javaclss2022second.sampleresult.shikaku;

import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class ShikakuSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shikaku _sikaku[] = new Shikaku[10];
		for (int i =0;i<10;i++) {
			_sikaku[i]=new Shikaku();
		}
		
		GameController gc = GameController.gameControllerCreate(1920, 1080);
		 
		for(int i=0;i<10;i++) {
		gc.addObject(_sikaku[i]);
		}
		gc.start();
	}

}
