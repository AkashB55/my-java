package javaQuestions04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

	public static void main(String[] args) {

		BigInteger n1 = new BigInteger("2123954574946904809463890868046093");
		BigInteger n2 = new BigInteger("212395457494690480946389086804999999");

		BigInteger sum = n1.add(n2);
		System.out.println(sum);

		BigInteger mul = n1.multiply(n2);
		System.out.println(mul);

		BigDecimal d1 = new BigDecimal("21.23954574946904809463890868046093");
		BigDecimal d2 = new BigDecimal("21.2395457494690480946389086804999999");

		BigDecimal d3 = d1.add(d2);
		System.out.println(d3);

		BigDecimal d4 = d1.multiply(d2);
		System.out.println(d4);
	}
}