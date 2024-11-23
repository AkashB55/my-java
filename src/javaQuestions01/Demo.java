package javaQuestions01;

class Test {
	
	static {
		System.out.println("Test -- Static Block");
	}
	//public static final int x = 20;
	public final int x = 20;
}

public class Demo {

	public static void main(String[] args) {
		//System.out.println(Test.x);
		System.out.println(new Test().x);
	}
}