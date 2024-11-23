package javaQuestions03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordCount {

	public static void main(String[] args) {

		String str = "thisAkashJavaAutomationTestPhase";

		int c = 0;
		if (Character.isLowerCase(str.trim().charAt(0))) {
			c++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				c++;
			}
		}
		System.out.println(c);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println(count1);

		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}
		System.out.println(count2);

		long count4 = str.chars().filter(e -> e >= 65 && e <= 90).count();
		System.out.println(count4);

		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println(count5);

		String reg = "[A-Z]+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		int count6 = 0;
		while (matcher.find()) {
			count6 += matcher.group(0).length();
		}
		System.out.println(count6);
	}
}