package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {

	public int waru(int a, int b) {
		if(b==0) {
			return 0;
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Warizan t = new Warizan();
		int kotae = t.waru(20, 0);
		System.out.println(kotae);
	}


}
