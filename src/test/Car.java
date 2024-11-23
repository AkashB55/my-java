package test;

public class Car {

	public static void start() {
		System.out.println("Car--start");
	}

	public static void start(int a) {
		System.out.println("Car--start");
	}

	public static void start(String price) {
		System.out.println("Car--start");
	}

	public void stop() {
		System.out.println("Car--stop");
	}

	public void refuel() {
		System.out.println("Car--refuel");
	}

}