package collectionConceptsPart02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));

		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));

		Iterator<String> it = capitalMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key = " + key + " Value = " + value);

		}

		System.out.println("---------------");

		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();

		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
		}

		System.out.println("----------------");

		capitalMap.forEach((k, v) -> System.out.println("key = " + k + " and value = " + v));

	}
}