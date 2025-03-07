package javaQuestions01;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		// printNum(1);
		// printNumber(1, 100);

		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	public static void printNumber(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}
}