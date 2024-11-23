package javaQuestions01;

public class StaticBlockQuestion3 {
	
	int age;
	
	static {
		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();
	}
	
	public static int createObject() {
		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();
		obj1.age = 40;
		return obj1.age;
	}
	
	private StaticBlockQuestion3() {
		age = 30;
	}

	public static void main(String[] args) {
		StaticBlockQuestion3 obj = new StaticBlockQuestion3();
		System.out.println(obj.age);
	}
}