package javaQuestions03;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbers {

	public static void main(String[] args) {

		Object num[] = new Object[100];

		Arrays.fill(num, new Object() {
			int count = 0;

			public String toString() {
				return Integer.toString(++count);
			}
		});

		System.out.println(Arrays.toString(num));

		System.out.println();

		String set = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(set, 1, set.length());
	}
}