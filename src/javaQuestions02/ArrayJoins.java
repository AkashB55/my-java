package javaQuestions02;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJoins {

	public static void main(String[] args) {

		String[] batsmen = { "Rohit", "Virat", "Dhawan", "Dhoni", "Yuvi", "Raina" };

		String[] bowlers = { "Bhumrah", "Ashwin", "Jaddu", "Chahal", "Siraj" };

		Stream<String> sBat = Arrays.stream(batsmen);
		Stream<String> sBow = Arrays.stream(bowlers);

		String fullTeam[] = Stream.concat(sBat, sBow).toArray(size -> new String[size]);

		for (String s : fullTeam) {
			System.out.println(s);
		}

		//System.out.println("--------------");

		// using google guava
		// String allTeam[] = ObjectArrays.concat(batsmen, bowlers, String.class);
		// for(String s : allTeam) {
		// System.out.println(s);
		// }

		// System.out.println("--------------");

		// int p1[] = {1, 2, 3, 4, 5};
		// int p2[] = {6, 7, 8, 9, 10};

		// int p3[] = Ints.concat(p1, p2);
		// for(int i : p3) {
		// System.out.println(i);
		// }
	}

}
