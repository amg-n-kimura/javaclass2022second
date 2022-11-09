package jp.co.amgakuin.javaclss2022second.sampleresult;

public class Tashizan {
	public int tasu(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Tashizan t = new Tashizan();
		int kotae = t.tasu(20, 10);
		System.out.println(kotae);

	}

}
