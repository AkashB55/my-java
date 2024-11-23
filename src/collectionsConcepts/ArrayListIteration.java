package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Akash");
		studentList.add("Lisa");
		studentList.add("Steve");

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

		System.out.println("-----------");

		for (String s : studentList) {
			System.out.println(s);
		}

		System.out.println("-----------");

		studentList.stream().forEach(ele -> System.out.println(ele));

		System.out.println("-----------");

		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}