package javaQuestions03;

public class ReverseNumber {

	public static void rev(long number) {

		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			rev(number / 10);
		}
	}

	public static void main(String[] args) {

		rev(123);
		rev(12345);
		rev(111);
		rev(123909888);
		rev(12898776543453l);
		rev(001);
		rev(100);
		rev(0);

//		int num = 12345;
//		while(num > 0) {
//			int rev = num % 10;
//			System.out.print(rev);
//			num = num/10;
//		}
	}
}