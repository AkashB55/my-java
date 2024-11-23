package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i[3]);

		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		double d[] = new double[3];

		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;

		System.out.println(d[2]);

		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 'z';
		c[2] = '$';

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		String s[] = new String[3];
		s[0] = "test";
		s[1] = "hello";
		s[2] = "world";

		System.out.println(s.length);
		System.out.println(s[1]);

		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1999";
		ob[4] = 'M';
		ob[5] = "London";

		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
