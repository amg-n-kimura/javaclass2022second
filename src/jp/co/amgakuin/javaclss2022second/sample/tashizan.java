package jp.co.amgakuin.javaclss2022second.sample;

public class tashizan {

	public int tasu(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		tashizan k = new tashizan();
		int kotae = k.tasu(20, 10);
		System.out.println(kotae);
		
		}

}
