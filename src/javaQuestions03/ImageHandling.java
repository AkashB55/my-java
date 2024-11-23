package javaQuestions03;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {

		try {
			// URL url = new URL(
			// "https://images-eu.ssl-images-amazon.com/images/G/31/Img23/Budget3/REC-PC_CC_758x608._SY608_CB564096366_.jpg");
			// BufferedImage image = ImageIO.read(url);

			File file = new File("/Users/akash/Downloads/test.jpg");
			BufferedImage image = ImageIO.read(file);

			ImageIO.write(image, "jpg", new File("./images/ref.jpg"));
			ImageIO.write(image, "gif", new File("./images/ref.gif"));
			ImageIO.write(image, "png", new File("./images/ref.png"));
			ImageIO.write(image, "bmp", new File("./images/ref.bmp"));

			System.out.println("done....");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}