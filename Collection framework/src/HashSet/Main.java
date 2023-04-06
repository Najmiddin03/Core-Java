package HashSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// Constructors
		// Cons - 1
		HashSet<Integer> h = new HashSet<>();// Initial capacity is 16
		h.add(8);
		h.add(7);
		h.add(3);
		h.add(1);

		// Cons - 2
		HashSet<Integer> h2 = new HashSet<>(20);// Initial capacity is 20

		// Cons - 3
		HashSet<Integer> h3 = new HashSet<>(10, 0.8f);// Initial capacity 10, load factor is 80%

		// Cons - 4
		HashSet<Integer> h4 = new HashSet<>(h);
		System.out.println("h:  " + h);
		System.out.println("h4: " + h4);

	}

}
