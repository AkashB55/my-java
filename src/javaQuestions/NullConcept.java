package javaQuestions;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {

		// Object obj = null;

		// System.out.println(obj);
		// System.out.println(str);
		// System.out.println(nc);

		// Integer i = null;
		// int j = 1;

		Integer i = null;
		Integer j = 10;

		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);

		System.out.println(null == null);
		System.out.println(null != null);

		String str = null;
		Integer i1 = null;
		Double d1 = null;

		String s1 = (String) null;
		System.out.println(s1 + "123");
		// System.out.println(s1.length());
		//System.out.println(s1.charAt(0));

		Integer i2 = (Integer) null;
		Double d2 = (Double) null;

	}

	public static void sum() {
		System.out.println("sum...");
	}

	public static void send() {
		System.out.println("send...");
	}
}