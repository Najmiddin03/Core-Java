package StringMethods;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Methods {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String Class Methods

		// 1. public int length()
		String str1 = "Hello";
		System.out.println(str1.length());// 5

		// 2. public String concat(String str)
		String str2_1 = "Neotron";
		String str2_2 = str2_1.concat(" Company");
		System.out.println(str2_1);// Neotron
		System.out.println(str2_2);// Neotron Company
		String str2_3 = "Neotron ".concat("Company").concat("!");
		System.out.println(str2_3);// Neotron Company!

		// We can use + operator too
		str2_1 = "Neotron" + " Company";
		System.out.println(str2_1);

		str2_1 = "Neotron";
		str2_2 = " Company";
		str2_3 = str2_1 + str2_2;
		System.out.println(str2_3);

		// 3. public boolean equals(Object obj)
		String str3_1 = "Hello";
		String str3_2 = "Hello";
		String str3_3 = "Hello ";
		System.out.println(str3_1.equals(str3_2)); // true
		System.out.println(str3_1.equals(str3_3)); // false

		// Difference between == and equals()
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false
		// == operator compares reference value of the String obj,
		// while equals() method in String class compares content of the String obj

		// 4. public boolean equalsIgnoreCase(String str)
		// This method is same with equals(), but not case sensitive
		String str4_1 = "Hello";
		String str4_2 = "hello";
		System.out.println(str4_1.equals(str4_2));// false
		System.out.println(str4_1.equalsIgnoreCase(str4_2));// true

		// 5. public int compareTo(String str)
		// Compares first letter of the String to another by dictionary order
		String str5_1 = "azzz";
		String str5_2 = "zaaa";
		String str5_3 = "azzz";
		System.out.println(str5_1.compareTo(str5_2));// -25
		System.out.println(str5_2.compareTo(str5_1));// 25
		System.out.println(str5_3.compareTo(str5_1));// 0

		// 6. public int compareToIgnoreCase(String str)
		// Same with compareTo(), but not case sensitive
		String str6_1 = "Hello";
		String str6_2 = "hello";
		System.out.println(str6_1.compareTo(str6_2));// -32
		System.out.println(str6_1.compareToIgnoreCase(str6_2));// 0

		// 7. public boolean startsWith(String str)
		String str7 = "Hello";
		System.out.println(str7.startsWith("He"));

		// 8. public boolean endsWith(String str)
		String str8 = "Hello";
		System.out.println(str8.endsWith("lo"));

		// 9. public boolean contains(String str)
		String str9 = "Hello";
		System.out.println(str9.contains("ell"));

		// 10. public char charAt(int index)
		String str10 = "Hello";
		System.out.println(str10.charAt(0));// H
		System.out.println(str10.charAt(1));// e

		// 11. public String replace(char oldChar, char newChar)
		String str11 = "Hello";
		System.out.println(str11);// Hello
		System.out.println(str11.replace('l', 'L'));// HeLLo

		// 12. public String replace(String oldString, String newString)
		String str12 = "Neotron Company";
		System.out.println(str12);
		System.out.println(str12.replace("tron", "chat"));

		// 13. public String replaceFirst(String oldString, String newString)
		String str13 = "Neo Neo Neo Neo";
		System.out.println(str13);
		System.out.println(str13.replaceFirst("Ne", "nE"));

		// 14. public String replaceAll(String oldString, String newString)
		String str14 = "Neo Neo Neo Neo";
		System.out.println(str14);
		System.out.println(str14.replaceAll("Ne", "nE"));

		// 15. public int indexOf(int asciiValue)
		String str15 = "Hello";
		int asciiValue = (int) 'l';
		System.out.println(str15.indexOf(asciiValue));

		// 16. public int indexOf(int ascii Value, int fromIndex)
		String str16 = "Hello";
		System.out.println(str16.indexOf(asciiValue, 3));

		// 17. public int indexOf(String str)
		String str17 = "Neochat from Neocompany";
		System.out.println(str17.indexOf("Neo"));

		// 18. public int indexOf(String str, int fromIndex)
		String str18 = "Neochat from Neocompany";
		System.out.println(str18.indexOf("Neo", 5));

		// 19. public int lastIndexOf(int asciiValue)
		String str19 = "Hello";
		System.out.println(str19.lastIndexOf(asciiValue));

		// 20. public int lastIndexOf(int asciiValue, int toIndex)
		String str20 = "Hello";
		System.out.println(str20.lastIndexOf(asciiValue, 2));

		// 21. public int lastIndexOf(String str)
		String str21 = "Neochat from Neocompany";
		System.out.println(str21.lastIndexOf("Neo"));

		// 22. public int lastIndexOf(String str, int toIndex)
		String str22 = "Neochat from Neocompany";
		System.out.println(str22.lastIndexOf("Neo", 10));

		// 23. public String substring(int startIndex)
		String str23 = "Neochat from Neocompany";
		System.out.println(str23);
		System.out.println(str23.substring(8));

		// 24. public String substring(int startIndex, int endIndex)
		String str24 = "Neochat from Neocompany";
		System.out.println(str24);
		System.out.println(str24.substring(8, 12));

		// 25. public String[] split(String delimiter)
		String str25 = "Neochat from Neocompany";
		String[] strArr25 = str25.split(" ");
		System.out.println(str25);
		for (String x : strArr25) {
			System.out.println(x);
		}

		// 26. public String[] split(String delimiter, int attempts)
		String str26 = "Neochat from Neocompany";
		String[] strArr26 = str26.split(" ", 2);
		for (String x : strArr26) {
			System.out.println(x);
		}

		// 27. public byte[] getBytes()
		String str27 = "Hello";
		byte[] byteArr27 = str27.getBytes();
		for (byte b : byteArr27) {
			System.out.println(b + "--->" + (char) b);
		}

		// 28. public byte[] getBytes(Charset cs)
		String str28 = "Hello";
		byte[] byteArr28 = str28.getBytes(Charset.defaultCharset());
		for (byte b : byteArr28) {
			System.out.println(b + "--->" + (char) b);
		}

		// 29. public byte[] getBytes(String charSet)
		String str29 = "Hello";
		byte[] byteArr29 = str29.getBytes("UTF-8");
		for (byte b : byteArr29) {
			System.out.println(b + "--->" + (char) b);
		}

		// 30. public char[] toCharArray()
		String str30 = "Hello";
		char[] charArray30 = str30.toCharArray();
		for (char x : charArray30) {
			System.out.print(x + " ");
		}
		System.out.println();

		// 31. public String trim()
		String str31 = "     Hello     ";
		System.out.println(str31);
		System.out.println(str31.trim());

		// 32. public String toLowerCase()
		String str32 = "HELLO";
		System.out.println(str32.toLowerCase());// hello

		// 33. public String toUpperCase()
		String str33 = "hello";
		System.out.println(str33.toUpperCase());// HELLO

		// 34. public String intern()
		String str34_1 = "Hello";
		String str34_2 = new String("Hello");
		String str34_3 = str34_2.intern();
		System.out.println(str34_3 == str34_1);// true
		System.out.println(str34_3 == str34_2);// false

	}

}
