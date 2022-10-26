package jp.co.amgakuin.javaclss2022second.sample;

public class Kakezan {

	public int kakeru(int a, int b) {
		return a*b;
	}
	
	public int tasu(int a, int b) {
		return a+b;
	}
	
	public int waru(int a, int b) {
		if(b == 0)
		{
			return 0;
		}
		else
		{
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		Kakezan k = new Kakezan();
		int kotae = k.waru(70, 5);
		System.out.println(kotae);
	}
}
