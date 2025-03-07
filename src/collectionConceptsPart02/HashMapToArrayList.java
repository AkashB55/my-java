package collectionConceptsPart02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);

		System.out.println("comp map size: " + compMap.size());

		Iterator it = compMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}

		System.out.println("------------------");

		compMap.forEach((k, v) -> System.out.println("Key = " + k + " and Value = " + v));

		System.out.println("------------------");

		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println("total comp count = " + compNamesList.size());
		for (String t : compNamesList) {
			System.out.println(t);
		}

		System.out.println("------------------");

		List<Integer> empValueList = new ArrayList<Integer>(compMap.values());
		System.out.println("Total emp values count = " + empValueList.size());
		for (Integer e : empValueList) {
			System.out.println(e);
		}
	}
}