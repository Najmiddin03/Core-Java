package List.Vector;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// Constructors
		// Cons - 1
		Vector<Integer> v1 = new Vector<>();
		System.out.println("v1 capacity: " + v1.capacity());

		// Cons - 2
		Vector<Integer> v2 = new Vector<>(5);
		System.out.println("v2 capacity: " + v2.capacity());

		// Cons - 3
		Vector<Integer> v3 = new Vector<>(5, 2);
		System.out.println("\nv3 capacity: " + v3.capacity());
		for (int i = 0; i < 6; i++) {
			v3.add(i);
		}
		System.out.println("v3 capacity after insertions: " + v3.capacity());

		// Cons - 4
		Vector<Integer> v4 = new Vector<>(v3);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);

		System.out.println();

		// Methods
		// 1. public void addElement(Object element)
		v1.addElement(5);
		v1.addElement(2);
		v1.addElement(6);
		System.out.println(v1);

		// 2. public Object firstElement()
		System.out.println("First element of v1: " + v1.firstElement());
		// 3. public Object lastElement()
		System.out.println("Last  element of v1: " + v1.lastElement());
		// 4. public Object elementAt(int index)
		System.out.println("2nd   element of v1: " + v1.elementAt(1));

		System.out.println();

		// 5. public void removeElementAt(int index)
		v1.removeElementAt(2);
		System.out.println("v1 after removing 3rd element:  " + v1);
		// 6. public boolean removeElement(Object element)
		v1.removeElement(5);
		System.out.println("v1 after removing Object 5:     " + v1);
		// 7. public void removeAllElements()
		v1.removeAllElements();
		System.out.println("v1 after removing all elements: " + v1);
	}

}
