package collectionsConcepts;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);

		ArrayList<Double> doubleMarks = new ArrayList<Double>();
		doubleMarks.add(12.33);
		doubleMarks.add(100.0);

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Tom");

	}
}