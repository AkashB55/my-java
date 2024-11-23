package javabasics;

public class Car {

	String name;
	String modelNumber;
	int price;
	String engine;

	public Car(String name, String modelNumber, int price, String engine) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
		this.engine = engine;
	}

	public static void main(String[] args) {

		Car obj1 = new Car("BMW", "320d", 10, "Auto");
		Car obj2 = new Car("Audi", "A8", 20, "Auto");
		Car obj3 = new Car("Honda", "City", 30, "Manual");

		System.out.println(obj1.name + " " + obj1.modelNumber + " " + obj1.price + " " + obj1.engine);

	}

}
