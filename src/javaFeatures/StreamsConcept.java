package javaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsConcept {

	public static void main(String[] args) {

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		Stream.of("hello", "java").map(e -> e + " world").forEach(System.out::println);

		String s[] = new String[5];
		s[2] = "Akash";
		Optional<String> isNull = Optional.ofNullable(s[2]);

		if (isNull.isPresent()) {
			System.out.println(s[2] + " " + s[2].length());
		} else {
			System.out.println("value is not available");
		}

		isNull.ifPresent(e -> System.out.println(e.length()));

		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e -> System.out.println("Bye.."));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<String> lang = Arrays.asList("java", "python", "ruby", "JS");
		lang.stream().forEach(e -> System.out.println(e));

		var x = "10";
		System.out.println(x + 10);
		var h = new HashSet<String>();
		h.add("akash");
		var h1 = new ArrayList<String>();
		h1.add("tom");
		System.out.println(h1.get(0));

		String browser = "chrome";
		switch (browser) {

		case "chrome":
			break;

		case "ff":
			break;

		case "ie":
			break;

		default:
			break;
		}

		var n = 3;
		var m = switch (n) {
		case 1 -> "one";
		case 2 -> "two";
		case 3 -> "three";
		case 4 -> "four";
		default -> "number not found..";
		};

		System.out.println(m);

		var response = """
				{
					"name": "tom",
					"age": "20",
					"place: "LA"
				}""";
		System.out.println(response);

		Employee e1 = new Employee("Peter", 24, "SFO");
		System.out.println(e1.name());
		System.out.println(e1.age());

		Object ob = new String("Akash");
		if (ob instanceof String) {
			System.out.println(((String) ob).length());
		}

		// Object ob1 = new String ("Akash");
		if (ob instanceof String myStr) {
			System.out.println(myStr.length());
		}
	}
}