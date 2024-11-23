package javaQuestions02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

	public static void main(String[] args) {

		String str = "testing";

		System.out.println(str.toCharArray().length);

		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);

		System.out.println(str.split("").length);

		int l = new StringBuilder(str).length();
		System.out.println(l);

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

		System.out.println(getLength("akash selenium"));

		int l1 = 0;
		String st = "123testing";
		try {
			l1 = st.getBytes("UTF-16BE").length / 2;
		} catch (Exception e) {

		}

		System.out.println(l1);

		System.out.println(getStringLength("testingselenium"));
	}

	public static int getLength(String str) {
		int i = 0;
		try {

			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}
	}

	public static int getStringLength(String str) {

		String st[] = str.split("");

		int count = 0;

		for (String s : st) {
			count += s.toCharArray().length;
		}

		return count;
	}
}