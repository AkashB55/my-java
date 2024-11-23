package test;

import javax.management.RuntimeErrorException;

public class FinallyConcept {

	public static void main(String[] args) {
		// test1();
		// test2();
		division();
	}

	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		}

		finally {
			System.out.println("inside finally block of test1 method");
		}
	}

	public static void test2() {
		try {
			System.out.println("inside test2 method");
		} finally {
			System.out.println("finally block in test2 method");
		}
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}

		finally {
			System.out.println("execute this code after any exception");
		}
	}

}
