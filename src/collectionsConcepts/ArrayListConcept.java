package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);

		System.out.println(ar.size());

		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());

		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		ar.add(600);
		ar.add(true);

		System.out.println(ar.size());

		ar.remove(9);

		System.out.println(ar.size());

		System.out.println(ar.get(4));
		// System.out.println(ar.get(9));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add('M');

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		// ar2.add(100);

		ArrayList<E> ar3 = new ArrayList<E>();// same <E> is maintained in the main()

		Employee e1 = new Employee("Akash", 27, "Qa");
		Employee e2 = new Employee("Tom", 29, "Dev");
		Employee e3 = new Employee("Peter", 32, "Admin");

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("************");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("Javascript");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("************");
		
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("************");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Java");
		
		ar7.retainAll(ar8);
		
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}

}