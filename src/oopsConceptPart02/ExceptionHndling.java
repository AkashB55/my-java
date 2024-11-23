package oopsConceptPart02;

public class ExceptionHndling {

	public static void main(String[] args) {
		// int i = 9/0;
		// System.out.println(i);

		// Thread.sleep(2000);

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {  //Exception e, Throwable e
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey -- this / by zero error");
		}

		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}
