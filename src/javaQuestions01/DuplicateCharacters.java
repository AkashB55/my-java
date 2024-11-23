package javaQuestions01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		printDuplicateCharacters("A");
		printDuplicateCharacters("");
		printDuplicateCharacters(null);
		printDuplicateCharacters("javata");
		printDuplicateCharacters("akash");
		printDuplicateCharacters("tesla");
		printDuplicateCharacters("1000");
		printDuplicateCharacters("007 james bond");
		printDuplicateCharacters(" ");

		duplicateChars("akashbera");
	}

	public static void printDuplicateCharacters(String str) {
		if (str == null) {
			System.out.println("Null String");
			return;
		}

		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		if (str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}

		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

	// online rahulsetty program

	static void duplicateChars(String inputString) {

		// Creating a hashmap object.
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
		Set<Character> keys = hash_map.keySet();
		for (char c : keys) {
			if (hash_map.get(c) > 1) {
				System.out.println(c + "-->" + hash_map.get(c));
			}
		}
	}
}