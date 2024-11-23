package javaQuestions04;

public class StringToInteger {

	public static int stringToNumber(String str) {
		if (str.length() == 1) {
			return (int) str.charAt(0) - 48;
		}

		int num = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			num = num * 10 + ((int) str.charAt(i) - 48);
		}
		return num;
	}

	public static int convertToInt(String str) {
		if (str.length() == 1) {
			return (int) str.charAt(0) - 48;
		}

		char ch[] = str.toCharArray();
		int sum = 0;
		int zeroAsc = (int) '0';
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroAsc);
		}
		return sum;
	}

	public static void main(String[] args) {

		String s = "9";
		// System.out.println(stringToNumber(s) + 10);
		System.out.println(convertToInt(s) + 20);
	}
}