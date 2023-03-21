package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class tryWithResources {

	public static void main(String[] args) {
		// without try-with-resources
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("kakashi.jpg");
			byte[] b = new byte[fis.available()];
			fis.read(b);
			fos = new FileOutputStream("naruto/kakashi.jpg");
			fos.write(b);

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// with try-with-resources
		try (FileInputStream fis2 = new FileInputStream("sasuke.png");
				FileOutputStream fos2 = new FileOutputStream("naruto/sasuke.png");) {
			byte[] b = new byte[fis2.available()];
			fis2.read(b);
			fos2.write(b);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
