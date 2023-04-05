package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Constructors
		// Cons - 1
		@SuppressWarnings("unused")
		ArrayList<String> al1 = new ArrayList<>();

		// Cons - 2
		ArrayList<String> al2 = new ArrayList<>(15);
		al2.add("AAA");
		al2.add("BBB");

		// Cons - 3
		ArrayList<String> al3 = new ArrayList<>(al2);
		System.out.println("al2: " + al2);
		System.out.println("al3: " + al3);
	}

}
