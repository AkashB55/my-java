package oopsConceptPart01;

public class LocalVsGlobalVariable {

	String name = "tom";
	int age = 25;

	public static void main(String[] args) {

		int i = 10;
		System.out.println(i);

		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	@SuppressWarnings("unused")// used this to remove warnings
	public void sum() {
		int i = 15;
		int j = 20;
	}

}