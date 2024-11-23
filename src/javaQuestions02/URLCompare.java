package javaQuestions02;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) {

		try {
			System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.16.118.116")));
		} catch (MalformedURLException e) {

		}
	}
}