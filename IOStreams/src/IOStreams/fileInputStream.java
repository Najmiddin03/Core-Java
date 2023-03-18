package IOStreams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class fileInputStream {

	public static void main(String[] args) throws Exception {
		// Using FileInputStream
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		FileInputStream fis = new FileInputStream(fileName);
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String data = new String(b);
		System.out.println(data);
		fis.close();

		// Using FileReader
		fileName = sc.nextLine();
		FileReader fr = new FileReader(fileName);
		int val = fr.read();
		data = "";
		while (val != -1) {
			data += (char) val;
			val = fr.read();
		}
		System.out.println(data);
		fr.close();

		// Example with FileInputStream
		fis = new FileInputStream("fileOutputStream.txt");
		size = fis.available();
		b = new byte[size];
		fis.read(b);
		data = new String(b);
		String[] tokens = data.split(" ");
		System.out.println("No. of words: " + tokens.length);
		int count = 0;
		for (String x : tokens) {
			if (x.equals("Neo")) {
				count++;
			}
		}
		System.out.println("No. of \"Neo\": " + count);
		fis.close();

		// Example with FileReader
		fr = new FileReader("fileOutputStream.txt");
		val = fr.read();
		data = "";
		while (val != -1) {
			data += (char) val;
			val = fr.read();
		}
		tokens = data.split(" ");
		System.out.println("Words: " + tokens.length);
		count = 0;
		for (String x : tokens) {
			if (x.equals("neo")) {
				count++;
			}
		}
		System.out.println("\"neo\": " + count);
		fr.close();

	}

}
