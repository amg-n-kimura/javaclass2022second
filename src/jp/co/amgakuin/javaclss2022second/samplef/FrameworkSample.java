package jp.co.amgakuin.javaclss2022second.samplef;
import jp.co.amgakuin.javaclss2022second.framework.GameController;

public class FrameworkSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameController gc = GameController.gameControllerCreate(640, 480);
		gc.start();
		for(int i=0;i<11;++i) {
		gc.addObject(new Shikaku());
		}
		
	}

}
