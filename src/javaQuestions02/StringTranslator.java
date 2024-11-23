package javaQuestions02;

import java.lang.reflect.Field;

public class StringTranslator {

	static {
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Akash", value.get("Hola Akash"));
			value.set("Good Morning Akash", value.get("Buenos dias Akash"));
			value.set("How are you?", value.get("¿Cómo estás?"));

			value.set("I need help in java", value.get("Please refer akash automation"));

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Hello Akash");
		System.out.println("Good Morning Akash");
		System.out.println("How are you?");
		System.out.println("I need help in java");
	}
}