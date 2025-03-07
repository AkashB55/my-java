package javaQuestions04;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter total columns: ");
		int cols = sc.nextInt();

		int data[][] = new int[rows][cols];

		System.out.println("please enter the matrix data:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = sc.nextInt();
			}
		}

//		for (int i=0; i<rows; i++) {
//			for (int j=0; j<cols; j++) {
//				System.out.println(data[i][j]+" ");
//			}
//			System.out.println();
//		}

//		for(int[] r : data) {
//			for(int x : r) {
//				System.out.println(x + " ");
//			}
//			System.out.println();
//		}

//		for(int[] r: data) {
//			System.out.println(Arrays.toString(r));
//		}

//		System.out.println(Arrays.deepToString(data));

		Arrays.stream(data).forEach((e) -> {
			Arrays.stream(e).forEach((j) -> System.out.println(j + " "));
		});
	}
}