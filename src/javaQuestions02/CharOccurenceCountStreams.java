package javaQuestions02;

public class CharOccurenceCountStreams {

	public static void main(String[] args) {

		String str = "testing solutions via akash tutorial";

		System.out.println(getCharCount(str, 't'));
	}

	public static long getCharCount(String str, char c) {

		return str.chars().filter(e -> (char) e == c).count();
	}

	public static long getCharCount(String str, char c1, char c2) {

		return str.chars().filter(e -> (char) e == c1 || (char) e == c2).count();
	}
}