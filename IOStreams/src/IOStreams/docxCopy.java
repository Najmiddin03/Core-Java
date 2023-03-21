package IOStreams;

import java.io.*;

public class docxCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("paper.docx");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fis.close();
		FileOutputStream fos = new FileOutputStream("naruto/paper2.docx");
		fos.write(b);
		fos.close();

		FileReader fr = new FileReader("paper.docx");
		String data = "";
		int val = fr.read();
		while (val != -1) {
			data += (char) val;
			val = fr.read();
		}
		FileWriter fw = new FileWriter("naruto/paper3.docx");
		char[] ch = data.toCharArray();
		fw.write(ch);
		fr.close();
		fw.close();

	}

}
