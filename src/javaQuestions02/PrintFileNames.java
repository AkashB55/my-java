package javaQuestions02;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {

		String path = "/Users/akash/Downloads";

		File file = new File(path);

		File downloadDir[] = file.listFiles();

		Arrays.sort(downloadDir);

		for (File e : downloadDir) {
			if (e.isFile()) {
				System.out.println("File : " + e.getName() + " & Path -> " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory : " + e.getName() + "  & Path -> " + e.getAbsolutePath());
			} else {
				System.out.println("Not known : " + e.getName() + "  & Path -> " + e.getAbsolutePath());
			}
		}
	}
}