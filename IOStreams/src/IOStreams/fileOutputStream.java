package IOStreams;

import java.io.FileOutputStream;

public class fileOutputStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fileOutputStream.txt");
		String str = "File Output Stream";
		byte[] b = str.getBytes();
		fos.write(b);
		fos.close();

	}

}
