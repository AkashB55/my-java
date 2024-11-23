package collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);

		System.out.println(ar);
		System.out.println(ar.get(2));
		// System.out.println(ar.get(-1));

		System.out.println(ar.size());
		System.out.println("LI " + 0);
		System.out.println("HI " + (ar.size() - 1));

		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());

		// Virtual capacity

		ArrayList<Object> ar1 = new ArrayList<Object>();

		System.out.println(ar1.size());
		ar1.add(100);

		System.out.println(ar1.size());
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);

		System.out.println(ar1.size());

		// list with other collections

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

		System.out.println(numbers);

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "Python", "PHP", "C++"));

		System.out.println(names);
		System.out.println(names.size());
	}
}