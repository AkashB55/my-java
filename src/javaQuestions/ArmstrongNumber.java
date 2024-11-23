package javaQuestions;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		System.out.println("The given number is " + num);
		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("this is an armstrong number");
		} else {
			System.out.println("this is not an armstrong number");
		}
	}

	public static void main(String[] args) {

		isArmstrongNumber(153);
		isArmstrongNumber(370);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(455);
	}
}