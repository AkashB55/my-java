package collectionConceptsPart02;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}
}

public class PriorityQueueWithStringLength {

	public static void main(String[] args) {

		MyComparator comparator = new MyComparator();
		PriorityQueue<String> pr = new PriorityQueue<>(10, comparator);
		pr.add("Akash");
		pr.add("Akashtest");
		pr.add("Akash automation");
		pr.add("A");
		pr.add("Aka");

		System.out.println(pr.poll());
	}
}