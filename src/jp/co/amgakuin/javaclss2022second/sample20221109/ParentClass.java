package jp.co.amgakuin.javaclss2022second.sample20221109;

public class ParentClass {

	public int publicInt;
	protected int protectedInt;
	private int privateInt;
	
	public ParentClass() {
		publicInt = 10;
		protectedInt = 20;
		privateInt = 30;
	}
	
	public void parentMethod() {
		System.out.println("Parent Method.");
		System.out.println("publicInt="+publicInt);
		System.out.println("protectedInt="+protectedInt);
		System.out.println("privateInt="+privateInt);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ParentClass parent = new ParentClass();
		parent.parentMethod();
	}

}
