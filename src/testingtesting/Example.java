package testingtesting;

import java.util.HashMap;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
//		static int a = 20;
//		int b = a + 10;
//		System.out.println(b);
//		
//		
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4); // Corrected line
//		a.removeAll(new ArrayList<>(Arrays.asList(1, 3, 4, 5)));
//		System.out.println(a);

//		characterCount("akash");
		
		duplicateChars("akashbera");

	}

//	public static void characterCount(String inputString) {
//
//		HashMap<Character, Integer> hash_map = new HashMap<>();
//		char[] strArray = inputString.toCharArray();
//
//		for (char c : strArray) {
//			if (hash_map.containsKey(c)) {
//				hash_map.put(c, hash_map.get(c) + 1);
//			}
//			else {
//				hash_map.put(c, 1);
//			}
//		}
//		System.out.println(hash_map);
//	}
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