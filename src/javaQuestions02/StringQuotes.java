package javaQuestions02;

public class StringQuotes {

	public static void main(String[] args) {

		System.out.println("/\"Hello\"/");
		System.out.println("\"/'Hello'/\"");

		System.out.println("\"Hello\"");

		System.out.println("I love \"java\" and \"programming\" and \"movies\"");

		System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");

		System.out.println(getXpath("akash"));
		System.out.println(getXpath("testing"));
		System.out.println(getXpath("123"));
		System.out.println(getXpath("yes"));
	}

	public static String getXpath(String name) {
		String xpath = "//input[@id='" + name + "']";
		// input[@id='akash']
		return xpath;
	}
}