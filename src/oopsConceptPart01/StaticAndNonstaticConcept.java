package oopsConceptPart01;

public class StaticAndNonstaticConcept {

	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {

		sum();
		StaticAndNonstaticConcept.sum();

		System.out.println(age);
		System.out.println(StaticAndNonstaticConcept.age);

		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		obj.sendMail();

		System.out.println(obj.name);
		//obj.sum(); // warning

	}

	public void sendMail() {
		System.out.println("send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}
}