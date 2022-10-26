package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {

	public int waru(int a, int b) {
		if(b != 0) {
			return a / b;
		}else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Warizan w = new Warizan();
		int kotae = w.waru(100, 10);
		System.out.println(kotae);
	}

}
