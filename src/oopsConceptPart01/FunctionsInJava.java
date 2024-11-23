package oopsConceptPart01;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		int l = obj.pqr();
		System.out.println(l);

		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
	}

	public void test() {
		System.out.println("test method");
	}

	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String qa() {
		System.out.println("Qa method");
		String s = "selenium";
		return s;
	}

	public int division(int x, int y) {
		System.out.println("Division method");
		int d = x / y;
		return d;
	}
}