package collectionConceptsPart02;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;

	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();

		System.out.println(HashMapInitialization.marksMap.get("A"));

		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		// map3.put("abc", 200);

		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "A grade" }, { "Akash", "C grade" }, })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));

		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ grade");
		System.out.println(map4.get("Lisa"));

		Map<String, String> map5 = Stream
				.of(new AbstractMap.SimpleEntry<>("Akash", "Java"), new AbstractMap.SimpleEntry<>("Tom", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map5.get("Akash"));
		map5.put("Lisa", "C++");
		System.out.println(map5.get("Lisa"));

		Map<String, String> map6 = Stream
				.of(new AbstractMap.SimpleImmutableEntry<>("Akash", "Java"),
						new AbstractMap.SimpleImmutableEntry<>("Tom", "Python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(map6.get("Tom"));
		map6.put("Steve", "Ruby");
		System.out.println(map6.get("Steve"));

		Map<String, String> emptyMap = Map.of();
		// emptyMap.put("Tom", "Python");
		// System.out.println(emptyMap.get("Tom"));

		Map<String, String> singletonMap = Map.of("k1", "v1");
		System.out.println(singletonMap.get("k1"));
		// singletonMap.put("k2", "v2");

		Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
		System.out.println(multiMap.get("k3"));

		Map<String, Integer> map7 = Map.ofEntries(new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200), new AbstractMap.SimpleEntry<>("C", 300));

		System.out.println(map7.get("C"));
		//map7.put("D", 400);

		// maps using guava dependency
		// Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India",
		// "Amazon", "Amazon shopping");
		// System.out.println(titleMaps.get("Amazon"));
		// titleMaps.put("Reddif",""Reddif India");

	}
}