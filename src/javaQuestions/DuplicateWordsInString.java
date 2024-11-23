package javaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		findDuplicateWords("Hey java is java the best language is java");
		findDuplicateWords("Hey python is not java not best language is python not java");

		findDuplicateWords("100 200 100 200 100 100");
	}

	public static void findDuplicateWords(String inputString) {

		String words[] = inputString.split(" ");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for (String word : words) {

			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		Set<String> wordsInString = wordCount.keySet();

		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}
}