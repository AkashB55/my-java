package javaQuestions03;

import java.io.IOException;

public class AppRun {

	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime runTime = Runtime.getRuntime();

		// Process pr = runTime.exec("appname path");//add
		// Thread.sleep(4000);
		// pr.destroy();

		// String s[] = new String[] {"path", "url"};//add
		// runTime.exec(s);

		String s[] = new String[] { "app file path", "video file path" };
		Process pr = runTime.exec(s);
		Thread.sleep(2000);
		pr.destroy();
	}
}