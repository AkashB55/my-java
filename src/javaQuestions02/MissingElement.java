package javaQuestions02;

public class MissingElement {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8,9};
		int n1 = findMissingNumber(num, 10);
		System.out.println(n1);
	}
	
	public static int findMissingNumber(int num[], int totalCount) {
		
		int expectedSum = totalCount * (totalCount + 1)/2;
		int actualSum = 0;
		
		for(int i : num) {
			actualSum += i;
		}	
		return expectedSum - actualSum;
	}
}