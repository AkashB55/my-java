package javaQuestions02;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(";", "{", "}");
		joiner.add("Tom").add("Lisa").add("Akash");

		System.out.println(joiner.toString());
	}
}