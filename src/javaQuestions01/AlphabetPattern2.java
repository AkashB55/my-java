package javaQuestions01;

public class AlphabetPattern2 {

	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println();
		}

		System.out.println("----------------");

		int beta = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) beta + " ");
			}
			// beta++;
			System.out.println();
		}

		System.out.println("----------------");

		int beta1 = 66;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) beta1 + " ");
			}
			// beta++;
			System.out.println();
		}

		System.out.println("----------------");

		int gamma = 70;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) gamma + " ");
			}
			gamma++;
			System.out.println();
		}

		System.out.println("----------------");

		int theta = 97;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) theta);
			}
			theta++;
			System.out.println();
		}
	}
}