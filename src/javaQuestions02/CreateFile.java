package javaQuestions02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {

		String path = "/Users/akash/Downloads/Docs/sample.text";

		File file = new File(path);

		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("file is created");
			} else {
				System.out.println("file is already present");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path: ");
			String fileName = sc.nextLine();

			FileOutputStream fos = new FileOutputStream(fileName, true);

			System.out.println("Enter the file content: ");
			String content = sc.nextLine();
			byte b[] = content.getBytes();

			fos.write(b);
			fos.close();
			System.out.println("File is saved on the given location path");

		} catch (Exception e) {
			System.out.println("Some exception is coming...");
			e.printStackTrace();
		}

		try {
			Path pathLocation = Paths.get("/Users/akash/Downloads/Docs/ple.text");
			Path newPath = Files.createFile(pathLocation);
			System.out.println("new file created at: " + newPath);
		} catch (Exception e) {
			System.out.println("Some exception is coming...");
			e.printStackTrace();
		}
	}
}