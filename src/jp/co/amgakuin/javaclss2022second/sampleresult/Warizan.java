package jp.co.amgakuin.javaclss2022second.sampleresult;

public class Warizan {

	/**
	 * コンスタラクタ
	 */
	public Warizan(){	
	}
	
	public int warizan(int a,int b) {
		int result;
		//例外処理
		try {
			result=a/b;
		}catch(Exception e) {
			result=0;
		}
		
		return a/b;
	}
	
	public static void main(String[]args) {
		// TOD0 自動生成されたメソッド・スタブ
		Warizan warizan = new Warizan();
		int a =10;
		int b=0;
		int result =warizan.warizan(a, b);
		System.out.println(a+"/"+b+"="+ result);
	}
}
