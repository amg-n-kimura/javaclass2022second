package jp.co.amgakuin.javaclss2022second.sample20221109;

public class ChildClass extends ParentClass {

	public void childMethod() {
		System.out.println("Child Method.");
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ChildClass child = new ChildClass();
		
		child.parentMethod();
	}

}
