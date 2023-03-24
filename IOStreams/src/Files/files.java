package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class files {

	public static void main(String[] args) throws Exception {
		File f = new File("E:/Java projects/IOStreams/file.txt");
		f.isFile();// to check file created or not
		f.createNewFile();// to create file in hardware
		System.out.println(f.isFile());// true
		System.out.println(f.getName());// to get name of the file
		System.out.println(f.getParent());// to get parent of the file
		System.out.println(f.getAbsolutePath());// to get absolute path

		FileOutputStream fos = new FileOutputStream(f);
		String data = "This is file";
		byte[] b = data.getBytes();
		fos.write(b);

		FileInputStream fis = new FileInputStream(f);
		byte[] b2 = new byte[fis.available()];
		fis.read(b2);
		data = new String(b2);

		System.out.println();
		System.out.println("Content of " + f.getName());
		System.out.println(data);

		// Creating directory
		File dir = new File("directory");
		dir.mkdir();// to create directory
		System.out.println(dir.isDirectory());// to check if directory exist
	}

}
