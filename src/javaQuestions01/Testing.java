package javaQuestions01;

public class Testing {

	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Initialization Block");
	}

	Testing() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new Testing();
	}
}