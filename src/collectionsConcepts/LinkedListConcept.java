package collectionsConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");

		System.out.println("content of linkedlist:" + ll);

		ll.addFirst("Akash");
		ll.addLast("Automation");

		System.out.println("content of linkedlist:" + ll);

		System.out.println(ll.get(0));

		ll.set(0, "Tom");
		System.out.println(ll.get(0));

		ll.removeFirst();
		ll.removeLast();

		System.out.println("content of linkedlist:" + ll);

		ll.remove(2);
		System.out.println("content of linkedlist:" + ll);

		System.out.println("***** using for loop");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		System.out.println("***** using advance for loop");
		for (String str : ll) {
			System.out.println(str);
		}

		System.out.println("***** using iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("***** using while loop");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}