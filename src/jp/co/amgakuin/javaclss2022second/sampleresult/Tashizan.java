package jp.co.amgakuin.javaclss2022second.sampleresult;

public class Tashizan {

	/**
	 * 足し算メソッド
	 * @param a
	 * @param b
	 * @return
	 */
	public int tashizan(int a, int b) {
		return a+b;
	}
	
	/**
	 * Mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Tashizan tashizan = new Tashizan();
		int a = 1;
		int b = 2;
		int result = tashizan.tashizan(a, b);
		//System.out.println(a + " + " + b + " = "+result);
	}

}
