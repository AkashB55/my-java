package javaQuestions03;

public class FindSubString {

	public static boolean isSubstring(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");
	}

	public static boolean isSubstring1(String main, String sub) {
		return main.contains(sub);
	}

	public static boolean isSubstring2(String main, String sub) {
		return main.indexOf(sub) != -1;
	}

	public static void main(String[] args) {

		System.out.println(isSubstring("akash java project", "java"));
		System.out.println(isSubstring1("akash java project", "java"));
		System.out.println(isSubstring2("akash java project", "java"));

		System.out.println(isSubstring("akash java project", "akash"));
		System.out.println(isSubstring("akash java project", "testing"));
		System.out.println(isSubstring("akash java $$ project", "$$"));
		System.out.println(isSubstring("automation", "auto"));
		System.out.println(isSubstring("automation", "test"));
		System.out.println(isSubstring("automation", "ti"));
		System.out.println(isSubstring("automation", "a"));
		System.out.println(isSubstring("automation", "11"));
		System.out.println(isSubstring("automation", "1"));
		System.out.println(isSubstring("automation", null));
		System.out.println(isSubstring("automation labs", " "));
		System.out.println(isSubstring("automation labs", "  "));
	}
}