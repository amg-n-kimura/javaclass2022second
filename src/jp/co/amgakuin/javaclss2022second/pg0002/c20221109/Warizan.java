package jp.co.amgakuin.javaclss2022second.pg0002.c20221109;

public class Warizan {
	
	public int waru(int a,int b) {
		
		//例外処理
		/*int result;
		
		try {
			result=a/b;
		}catch(Exception e) {
			result=0;
		}
		return result;*/
		
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
