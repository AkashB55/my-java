package javaQuestions03;

import java.util.Arrays;

public class PasswordStore {

	public static void main(String[] args) {

		String pwd = "Akash123";
		System.out.println("pwd is: " + pwd);

		char c[] = new char[] { 'A', 'k', 'a', 's', 'h', '1', '2', '3' };
		System.out.println("pwd is: " + c);

		Arrays.fill(c, '*');

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
}