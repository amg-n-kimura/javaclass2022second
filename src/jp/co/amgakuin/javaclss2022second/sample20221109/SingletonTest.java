package jp.co.amgakuin.javaclss2022second.sample20221109;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//できない
		//SingletonSample singleton = new SingletonSample();
		SingletonSample singleton =  SingletonSample.getInstance();
		singleton.singletonMethod1();
	}

}
