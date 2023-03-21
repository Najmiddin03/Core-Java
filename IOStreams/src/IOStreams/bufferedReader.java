package IOStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedReader {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// difference between readLine() and read()
		System.out.print("Enter data: ");
		String data = br.readLine();
		System.out.print("Enter the same data: ");
		int val = br.read();
		System.out.println("readLine(): " + data);
		System.out.println("read(): " + val + " " + (char) val);// read() takes only 1 element from console
		String data2 = br.readLine();
		System.out.println("The rest of the data: " + data2);// the rest of the elements will remain in BufferedReader
																// and can be used later

		// using BufferedReader for primitive data types
		System.out.print("Integer: ");
		int i = Integer.parseInt(br.readLine());
		System.out.print("Byte: ");
		byte b = Byte.parseByte(br.readLine());
		System.out.print("Long: ");
		long l = Long.parseLong(br.readLine());
		System.out.print("Short: ");
		short sh = Short.parseShort(br.readLine());
		System.out.print("Float: ");
		float f = Float.parseFloat(br.readLine());
		System.out.print("Double: ");
		double d = Double.parseDouble(br.readLine());
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(sh);
		System.out.println(f);
		System.out.println(d);
		br.close();

		//BufferedReader with try-with-resources
		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));) {
			data = br2.readLine();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
