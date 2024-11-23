package onlineJavaQuestions;

public class ReverseAStringExample {

	public static void main(String[] args) {
		String inputString = "Akash";
		String outputString = "";
		System.out.println(inputString.length());
		for (int i = inputString.length() - 1; i >= 0; i--) {
			outputString = outputString + inputString.charAt(i);
		}

		System.out.println(outputString);
	}
}