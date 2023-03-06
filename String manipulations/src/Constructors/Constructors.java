package Constructors;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Constructors {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// Cons 1
		String str1 = new String();
		System.out.println(str1);
		String str1_22 = new String("Hello");
		System.out.println(str1_22);

		// Cons 2
		String str2 = "Hello";
		System.out.println(str2);

		// difference between str1 and str2
		String str1_1 = new String("Najmiddin");
		String str1_2 = new String("Najmiddin");
		System.out.println(str1_1 == str1_2);// false
		String str21 = "Najmiddin";
		String str22 = "Najmiddin";
		System.out.println(str21 == str22);// true

		// Cons 3 - public String(byte[] b)
		byte[] b = { 72, 101, 108, 108, 111 };
		String str3 = new String(b);
		System.out.println(str3);

		// Cons 4 - public String(byte[] b, int a, int b)
		String str4 = new String(b, 1, 4);
		System.out.println(str4);

		// Cons 5 - public String(char[] ch)
		char[] ch = { 'H', 'e', 'l', 'l', 'o' };
		String str5 = new String(ch);
		System.out.println(str5);

		// Cons 6 - public String(char[] ch, int a, int b)
		String str6 = new String(ch, 1, 4);
		System.out.println(str6);

		// Cons 7 - public String(StringBuffer sb)
		StringBuffer sb = new StringBuffer("Hello");
		String str7 = new String(sb);
		System.out.println(str7);

		// Cons 8 - public String(StringBuilder sb)
		StringBuilder sb2 = new StringBuilder("Hello");
		String str8 = new String(sb2);
		System.out.println(str8);

		// Cons 9 - public String(byte[] b, Charset cs)
		String str9 = new String(b, Charset.defaultCharset());
		System.out.println(str9);

		// Cons 10 - public String(byte[] b, int a, int b, Charset sc)
		String str10 = new String(b, 1, 4, Charset.defaultCharset());
		System.out.println(str10);

		// Cons 11 - public String(byte[] b, String charsetName)
		String str11 = new String(b, "US-ASCII");
		System.out.println(str11);

		// Cons 12 - public String(byte[] b, int a, int b, String charsetName)
		String str12 = new String(b, 1, 4, "UTF-8");
		System.out.println(str12);
		
		// Cons 13 - public String(char[] ch, Charset cs)
		// Cons 14 - public String(char[] ch, int a, int b, Charset sc)
		// Cons 15 - public String(char[] ch, String charsetName)
		// Cons 16 - public String(char[] ch, int a, int b, String charsetName)
	}

}
