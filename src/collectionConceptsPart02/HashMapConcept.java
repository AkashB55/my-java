package collectionConceptsPart02;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Akash", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		marks.put(null, 500);

		System.out.println(marks.get("Lisa"));

	}
}
