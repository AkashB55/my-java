package javaQuestions04;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number of rows");
		
		int rows = sc.nextInt();

		System.out.println("please enter number of columns");
		
		int cols = sc.nextInt();

		int matrix[][] = new int[rows][cols];
		int transpose[][] = new int[cols][rows];
		
		System.out.println("enter the data for the matrix:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("print the input matrix:");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("create the transpose matrix:");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("print the transpose matrix:");
		
		for (int[] r : transpose) {
			System.out.println(Arrays.toString(r));
		}
	}
}