package javaQuestions02;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 3, 5, 7, 8, 6, 6, 4 };

		double total = 0;
		for (int e : num) {
			total = total + e;
		}

		System.out.println("total: " + total);
		System.out.println("avg is: " + (total / num.length));

		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());

		// google guava
		// double avg1 = DoubleMath.mean(num);
		// System.out.println(avg1);
	}
}