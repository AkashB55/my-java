package oopsConceptPart01;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}

	public static void main(int p) {

	}

	public static void main(int p, int h) {

	}

	public void sum() {
		System.out.println("Sum method - zero parameter");
	}

	public void sum(double d) {
		System.out.println("Sum method - single parameter diff datatype");
	}

	public void sum(int i) {
		System.out.println("Sum method - single parameter");
		System.out.println(i);
	}

	public void sum(int k, int l) {
		System.out.println("Sum method - two parameter");
		System.out.println(k + l);
	}

}
