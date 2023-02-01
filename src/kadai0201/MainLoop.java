package kadai0201;

import lombok.Getter;
import lombok.Setter;

public class MainLoop extends Thread {

	private Thread myThread = null;
	public MainLoop() {
		myThread = new Thread(this);
		myThread.start();
	}

	@Getter
	@Setter
	private boolean doProcess = true;
	
	public void run() {
		long past;
		long counter = 0;
		while(doProcess) {
			//現在時刻取得
			past = System.currentTimeMillis();
			
			//処理が終わった時刻を取得
			past = System.currentTimeMillis() - past;
			if (counter++ >= 30) {
				System.out.println(past);
				counter = 0;
			}
			if (past < 33) {
				try {
					Thread.sleep((33 - past));
				} catch(Exception e) {
					
				}
			}
			
			
			
		}
	}
}
