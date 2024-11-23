package javaQuestions03;

public class IsNumber {

	public static boolean isCorrectPhoneNumber(String number) {
		// return number.matches("[0-9]{10}");
		return number.matches("\\d{10}");
	}

	public static boolean isCorrectNumber(String number) {
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
	}

	public static boolean isCorrectPhNumber(String number) {
		if (number.length() == 10 && isCorrectNumber(number)) {
			System.out.println("valid ph number: " + number);
			return true;
		}
		System.out.println("not a valid ph number: " + number);
		return false;
	}

	public static boolean isNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("this is a valid number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("not a valid number: " + number);
			return false;
		}
		return true;
	}

	public static boolean isValidPhoneNumber(String number) {
		if (number.length() == 10 && isNumber(number)) {
			System.out.println("valid phone number: " + number);
			return true;
		}
		System.out.println("not a valid phone number: " + number);
		return false;
	}

	public static boolean isValidCCNumber(String number) {
		if (number.length() == 16 && isNumber(number)) {
			System.out.println("valid CC number: " + number);
			return true;
		}
		System.out.println("not a valid CC number: " + number);
		return false;
	}

	public static void main(String[] args) {

		System.out.println(isNumber("123a"));
		System.out.println(isValidPhoneNumber("8989876789"));
		System.out.println(isValidPhoneNumber("90909"));
		System.out.println(isValidPhoneNumber("89898767891"));
		System.out.println(isValidCCNumber("8989876789909898"));
		System.out.println(isCorrectPhoneNumber("987654567890"));
		System.out.println(isCorrectPhoneNumber("999878987"));

		System.out.println(isCorrectNumber("100"));
		System.out.println(isCorrectNumber("100.12"));
		System.out.println(isCorrectNumber("-100.12"));
		System.out.println(isCorrectNumber("-120"));
		System.out.println(isCorrectNumber("120A"));
		System.out.println(isCorrectNumber("-120AA"));
		System.out.println(isCorrectNumber("999878987"));

		System.out.println(isCorrectPhNumber("-9898789878"));
	}
}