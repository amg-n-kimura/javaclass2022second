package jp.co.amgakuin.javaclss2022second.sample20221109;

public class SingletonSample {

	private SingletonSample() {
		
	}
	
	private static SingletonSample myInstance = new SingletonSample();
	
	public static SingletonSample getInstance() {
		return myInstance;
	}
	
	public void singletonMethod1() {
		System.out.println("singletonMethod1");
	}
}
