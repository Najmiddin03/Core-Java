package StringMethods;

public class Methods {

	public static void main(String[] args) {
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
	}

}
