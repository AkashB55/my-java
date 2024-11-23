package javaQuestions02;

import java.util.function.IntPredicate;

public class VowelsCount {

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

	public static void main(String[] args) {

		String str = "testing";
		int vCount = 0;

		for (int x = 0; x < str.length(); x++) {
			if (isVowel(str.charAt(x))) {
				vCount++;
			}
		}
		System.out.println(vCount);

		System.out.println("using Java 8 Streams");

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I'
						|| t == 'O' || t == 'U';
			}
		};

		String test = "aeiou";
		long count = test.chars().filter(vowel).count();
		System.out.println(count);

		//Google Guava
		// String st = "Aa";
		// int voCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		// System.out.println(voCount);
	}
}