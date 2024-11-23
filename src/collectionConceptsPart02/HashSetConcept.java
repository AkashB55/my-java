package collectionConceptsPart02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Alpha");
		hs.add(null);

		System.out.println(hs);

		System.out.println(hs.contains("testing"));

		for (String e : hs) {
			System.out.println(e);
		}

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		hs.remove("Beta");
		System.out.println(hs);

		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 5, 6, 8, 9, 10 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 5, 6, 7, 9 }));

		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		System.out.println("-----------");

		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		System.out.println("-----------");

		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
	}
}