package javaQuestions;

public class NullArgument {

	public static void main(String a[]) {
		test(null);
	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {
		System.out.println("String Argument");
	}
	
//	public static void test(StringBuilder s) {
//		System.out.println("String Argument");
//	}

}
