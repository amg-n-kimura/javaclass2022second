package jp.co.amgakuin.javaclss2022second.sample20221109;

public class TestClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		
		ParentClass pc;
		ChildClass cc;
		
		pc = child;
		//cc = parent; これはできない
		
		pc.parentMethod();
		if (pc instanceof ChildClass) {
			((ChildClass) pc).childMethod();
		}
	}

}
