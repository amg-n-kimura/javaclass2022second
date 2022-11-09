
package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {

	public int waru(int a,int b) {
		if(a  == 0 || b == 0) {
			
		}
		return a/b;
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Warizan t = new Warizan();
         int kotae = t.waru(18,6);
         System.out.println(kotae);
	}

}
