package jp.co.amgakuin.javaclss2022second.sample;

public class warizan {
    public int waru(int a, int b) {
    	if(a == 0 || b == 0) {
    		return 0;
    	}
    	else {
    	    return a / b;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        warizan k = new warizan();
        int kotae = k.waru(20, 10);
        System.out.println(kotae);
	}

}
