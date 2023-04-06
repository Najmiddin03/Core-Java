package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(8);
		ss.add(9);
		ss.add(4);
		ss.add(7);
		ss.add(3);
		System.out.println(ss);

		// Methods
		// 1. public Object first()
		System.out.println("First element: " + ss.first());
		// 2. public Object last()
		System.out.println("Last  element: " + ss.last());
		// 3. public SortedSet headSet(Object element)
		System.out.println("Less    than 7: " + ss.headSet(7));
		// 4. public SortedSet tailSet(Object element)
		System.out.println("Greater than 7: " + ss.tailSet(7));
		// 5. public SortedSet subSet(Object element1, Object element2)
		System.out.println("Between 4 and 8: " + ss.subSet(4, 8));

	}

}
