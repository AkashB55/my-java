package javaQuestions01;

public class StaticBlockQuestion4 {
	
	static int age = 20;

	static {
		System.out.println("static 1");
	}

	static {
		System.out.println("static 2");
	}
	static {
		System.out.println("static 3");
	}
}
