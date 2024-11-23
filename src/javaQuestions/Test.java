package javaQuestions;

public class Test {

	public static void main(String[] args) {
		System.out.println(Main.x);
	}
}

class Main {
	public static final int x = 100;

	static {
		System.out.println("main -- class static block...");
	}
}