package jp.co.amgakuin.javaclss2022second.sample;

public class Warizan {
	
	public int waru(int a,int b) {
		
		if(b==0) {
			return 0;
		}else {
		return a/b;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Warizan w=new Warizan();
		
		int answer=w.waru(10,2);
		
		System.out.println(answer);
		

	}

}
