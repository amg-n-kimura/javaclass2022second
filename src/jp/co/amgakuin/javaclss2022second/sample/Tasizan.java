package jp.co.amgakuin.javaclss2022second.sample;

public class Tasizan {

	public int tasu(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Tasizan t = new Tasizan();
		int kotae = t.tasu(9, 28);
		System.out.println(kotae);
	}
}
