package LinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// Constructors
		// Cons - 1
		LinkedList<Integer> l = new LinkedList<>();
		l.add(8);
		l.add(5);
		l.add(2);
		System.out.println("l:  " + l);

		// Cons - 2
		LinkedList<Integer> l2 = new LinkedList<>(l);
		System.out.println("l2: " + l2);

		// Methods
		// 1. public void addFirst(Object element)
		// 2. public void addLast(Object element)
		System.out.println("\nl before addFirst(): " + l);
		l.addFirst(9);
		System.out.println("l after  addFirst(): " + l);
		l.addLast(1);
		System.out.println("l after  addLast():  " + l);

		// 3. public Object getFirst()
		// 4. public Object getLast()
		System.out.println("First element in l: " + l.getFirst());
		System.out.println("Last  element in l: " + l.getLast());

		// 5. public void removeFirst()
		// 6. public void removeLast()
		l.removeFirst();
		System.out.println("l after removeFirst(): " + l);
		l.removeLast();
		System.out.println("l after removeLast():  " + l);
	}

}
