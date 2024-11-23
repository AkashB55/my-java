package javaQuestions02;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {

		String path = "/Users/akash/Downloads/Docs/sam.text";
		Scanner sc = null;
		try {
			File file = new File(path);
			sc = new Scanner(file);
			System.out.println("File content is:");

			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}