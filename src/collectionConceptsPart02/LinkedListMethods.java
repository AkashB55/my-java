package collectionConceptsPart02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());

		names.add("Tom");
		names.add("Akash");
		names.add("Robby");
		names.add("Lisa");

		System.out.println(names.size());

		System.out.println(names);
		System.out.println(names.get(1));

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(4, "Steve");
		System.out.println(names);

		names.add(2, "Ram");
		System.out.println(names);

		LinkedList<String> users = new LinkedList<String>();

		users.add("Peter");
		users.add("Trump");

		names.addAll(users);
		System.out.println(names);

		names.addFirst("Kamala");
		System.out.println(names);

		names.addLast("Shivin");
		System.out.println(names);

		names.remove(2);
		System.out.println(names);

		names.removeAll(users);
		System.out.println(names);

		names.removeFirst();
		names.removeLast();
		System.out.println(names);

		names.clear();
		System.out.println(names);

		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(lang.size());

		lang.add("JAVA");
		lang.add("Python");
		lang.add("Ruby");
		lang.add("Javascript");

		System.out.println(lang.size());
		Iterator<String> itr = lang.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String e : lang) {
			System.out.println(e);
		}

		Collections.sort(lang);
		System.out.println(lang);
	}
}