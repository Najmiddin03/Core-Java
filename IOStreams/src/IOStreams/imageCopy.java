package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imageCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("naruto1.jpg");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fis.close();

		FileOutputStream fos = new FileOutputStream("naruto/naruto2.jpg");
		fos.write(b);
		fos.close();

	}

}
