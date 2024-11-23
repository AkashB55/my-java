package javaQuestions01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String infra[] = { "Amazon", "Flipkart", "Ebay", "Amazon", "GCP", "IBM", "GCP", "Flipkart" };

		System.out.println("*****brute force*****");

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println("*****hasp set*****");

		Set<String> data = new HashSet<String>();
		for (String e : infra) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

		System.out.println("*****hasp map*****");

		HashMap<String, Integer> infraMap = new HashMap<String, Integer>();
		for (String e : infra) {
			Integer count = infraMap.get(e);
			if (count == null) {
				infraMap.put(e, 1);
			} else {
				infraMap.put(e, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = infraMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println("*****streams set and filters*****");

		Set<String> dataSet = new HashSet<String>();

		Set<String> dupSet = Arrays.asList(infra).stream().filter(e -> !dataSet.add(e))
									.collect(Collectors.toSet());
		System.out.println(dupSet);

		System.out.println("*****streams grouping by*****");

		Set<String> eleSet = Arrays.asList(infra).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		System.out.println(eleSet);

		System.out.println("*****streams using frequency*****");

		List<String> list = Arrays.asList(infra);

		Set<String> eleList = list.stream().filter(e -> Collections.frequency(list, e) > 1)
									.collect(Collectors.toSet());

		System.out.println(eleList);
	}
}