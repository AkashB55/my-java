package javaQuestions04;

public class PrintNames {

	public static void main(String[] args) {

		String name = "akash";
		String s = "i";
		s = s.replaceAll("i", "iiiiiiiiii");
		s = s.replaceAll("i", "iiiiiiiiii");

		s = s.replaceAll("i", name + "\n");
		System.out.println(s);
	}
} 