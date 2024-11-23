package javaQuestions03;

public class CheckBinaryNumber {

	static void isBinaryNumber(int number) {
		boolean isBinary = true;
		int copyNumber = number;
		while (copyNumber != 0) {
			int rem = copyNumber % 10;
			if (rem > 1) {
				isBinary = false;
				break;
			} else {
				copyNumber = copyNumber / 10;
			}
		}

		if (isBinary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}
	}

	public static void isBin(int number) {
		if (String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}
	}

	public static void isBinNum(int number) {
		try {
			Integer.parseInt(String.valueOf(number), 2);
			System.out.println(number + " is a binary number");
		} catch (Exception e) {
			System.out.println(number + " is not a binary number");
		}
	}

	public static void main(String[] args) {

		isBinaryNumber(1011);
		isBinaryNumber(2066);
		isBinaryNumber(2011);
		isBinaryNumber(1);
		isBinaryNumber(0);
		isBinaryNumber(01);
		isBinaryNumber(101101101);

		System.out.println("---------");

		isBin(1011);
		isBin(2011);
		isBin(1);
		isBin(0);
		isBin(101101101);

		System.out.println("---------");

		isBinNum(1011);
		isBinNum(2011);
		isBinNum(565);
		isBinNum(0);
		isBinNum(1);
		isBinNum(101101101);
	}
}