package javaQuestions01;

public class AlphabetPattern {

	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		int beta = 97;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (beta + j) + " ");
			}
			System.out.println();
		}
	}
}