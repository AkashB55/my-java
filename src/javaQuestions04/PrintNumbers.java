package javaQuestions04;

public class PrintNumbers {

	static int count = 1;

	public static void printNum() {

//		try {
		if (count <= 100000) {
			System.out.println("Hello");
			count++;
			printNum();
		}

//		} catch (StackOverflowError e) {

//		}
	}

	public static void main(String[] args) {

	}
}