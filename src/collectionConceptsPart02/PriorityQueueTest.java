package collectionConceptsPart02;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
//		pr.add(50);
//		pr.add(750);
//		pr.add(900);
//		pr.add(500);
//		pr.add(100);

		System.out.println(pr.size());

		System.out.println(pr.poll());
		System.out.println(pr.remove());
	}
}