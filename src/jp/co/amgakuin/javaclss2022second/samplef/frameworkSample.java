package jp.co.amgakuin.javaclss2022second.samplef;


import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class frameworkSample {

	public static void main(String[] args) {
		
		Shikaku arr[]=new Shikaku[10];;
		
		// TODO 自動生成されたメソッド・スタブ
		GameController gc=GameController.gameControllerCreate(640,480);
		gc.start();
		for(int i=0;i<10;++i) {
			arr[i] = new Shikaku();
		}
		for(int i=0;i<10;++i) {
			gc.addObject(arr[i]);
		}

	}

}
