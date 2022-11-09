package jp.co.amgakuin.javaclss2022second.pg0012.c20221109;

public class Tashizan {

	/**
	 * 足し算クラス
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int tashizan(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Tashizan tashizan = new Tashizan();
		int a = 1;
		int b = 2;
		int result = tashizan.tashizan(a, b);
		System.out.println(a + " "+ "+" + b + " = "+result);
	}

}
