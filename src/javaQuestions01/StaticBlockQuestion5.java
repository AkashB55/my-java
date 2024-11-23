package javaQuestions01;

public class StaticBlockQuestion5 {
	
	String name;
	static int age;
	
	static {
		StaticBlockQuestion5 e1 = new StaticBlockQuestion5();
		e1.name = "Akash";
		age = 25;
		
		System.out.println(e1.name + " " + age);
	}

	public static void main(String[] args) {
		
	}
}