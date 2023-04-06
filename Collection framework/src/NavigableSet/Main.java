package NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(8);
		ns.add(6);
		ns.add(7);
		ns.add(1);
		ns.add(9);
		System.out.println(ns);

		// Methods
		// 1. public NavigableSet descendingSet()
		System.out.println("Descending order: " + ns.descendingSet());

		// 2. public Object ceiling(Object element)
		System.out.println("Smallest number that is x >=6: " + ns.ceiling(6));
		// 3. public Object higher(Object element)
		System.out.println("Smallest number that is x > 6: " + ns.higher(6));
		// 4. public Object floor(Object element)
		System.out.println("Biggest  number that is x <=6: " + ns.floor(6));
		// 5. public Object lower(Object element)
		System.out.println("Biggest  number that is x < 6: " + ns.lower(6));

		System.out.println();

		// 6. public Object pollFirst()
		System.out.println("First element: " + ns.pollFirst());
		// 7. public Object pollLast()
		System.out.println("Last  element: " + ns.pollLast());
		System.out.println("Set after pollings: " + ns);

	}

}
