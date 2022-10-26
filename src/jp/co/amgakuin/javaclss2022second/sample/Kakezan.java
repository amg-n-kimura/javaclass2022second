package jp.co.amgakuin.javaclss2022second.sample;

public class Kakezan {


	public int kakeru(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Kakezan k = new Kakezan();
		int kotae = k.kakeru(20, 10);
		System.out.println(kotae);
		
		}

}
