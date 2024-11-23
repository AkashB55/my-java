package javaQuestions04;

import java.io.File;

public class Resume {

	public static void main(String[] args) {

		File file = new File("./src/javaQuestions04/PrintNames.java");

		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);

		System.out.println("done....");
	}
}