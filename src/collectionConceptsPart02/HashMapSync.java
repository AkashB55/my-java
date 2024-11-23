package collectionConceptsPart02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "Akash");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");

		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);

		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python");
		concurrentMap.put("C", "Ruby");

		System.out.println(concurrentMap.get("A"));
	}
}