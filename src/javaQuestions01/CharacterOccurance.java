package javaQuestions01;

import java.util.HashMap;

public class CharacterOccurance {

	public static void main(String[] args) {

		String str = "I love coding and testing i am so happy";

		getCharOccurrence(str, 'g');
		getCharCount(str, 'i');
		getCharCountUsingStreams(str, "i");

		// int count = StringUtils.countMatches(str, "p");
		// System.out.println(count);
		
		characterCount(str);
	}

	public static void getCharCountUsingStreams(String str, String val) {
		long count = str.chars().mapToObj(e -> String.valueOf((char) e)).filter(e -> e.equals(val)).count();
		System.out.println(val + ":" + count);
	}

	public static void getCharCount(String str, char val) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}

	public static void getCharOccurrence(String str, char val) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == val) {
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}
	// added fron online rahulshetty
	// this method get all the character count from a string and adds in a hashmap
	public static void characterCount(String inputString) {

		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c) + 1);
			}

			else {
				hash_map.put(c, 1);
			}

		}
		System.out.println(hash_map);
	}
}