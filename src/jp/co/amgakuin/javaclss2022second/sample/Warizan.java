package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {

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
		Warizan w = new Warizan();
		int kotae = w.waru(928, 0);
		
		System.out.println(kotae);
	}
}
