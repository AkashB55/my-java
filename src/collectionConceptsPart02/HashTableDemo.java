package collectionConceptsPart02;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Akash", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		marks.put("Robert", 700);
		marks.put("Ram", 605);
		marks.put("Rom", 655);
		marks.put("Rom1", 555);
		marks.put("Lisa1", 3300);

		// marks.put("Test", null);

		System.out.println(marks.get("Akash"));
		System.out.println(marks.get("Peter"));
		System.out.println(marks.get("Test"));

	}
}