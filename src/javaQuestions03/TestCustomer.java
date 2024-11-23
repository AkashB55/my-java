package javaQuestions03;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setName("Tom");
		c1.setAge(20);
		System.out.println(c1.getName());

		// Customer c1 = new Customer("lisa", 30, "NY", true, "01-01-2000");
		// System.out.println(c1);
		// System.out.println(c1.getName() + c1.getDob());
		// c1.setActive(false);
		// System.out.println(c1.isActive());
	}
}