package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {

	public int waru(int a, int b) {
		if(b==0||a==0) {
			return 0;
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		Warizan k = new Warizan();
		int kotae = k.waru(0, 10);
		System.out.println(kotae);
	}

}
