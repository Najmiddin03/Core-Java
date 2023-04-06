package Cursors_Iterators;

import java.util.ListIterator;
import java.util.Vector;

public class listIterator {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < 10; i++) {
			v.add(i + 1);
		}
		ListIterator<Integer> li = v.listIterator();
		System.out.println("Forward");
		while (li.hasNext()) {
			System.out.println("[" + li.nextIndex() + "] ---> " + li.next());
		}
		System.out.println("Backward");
		while (li.hasPrevious()) {
			System.out.println("[" + li.previousIndex() + "] ---> " + li.previous());
		}
		while (li.hasNext()) {
			int element = li.next();
			if (element == 3) {
				li.add(30);
			}
			if (element == 5) {
				li.set(50);
			}
			if (element == 7) {
				li.remove();
			}
		}
		System.out.println("Vector after add, set and remove operations:");
		System.out.println(v);

	}

}
