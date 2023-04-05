package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// Constructor
		Stack<Integer> s = new Stack<>();

		// Methods
		// 1. public void push(Object element)
		s.push(2);
		s.push(5);
		s.push(6);

		// 2. public Object pop()
		System.out.println("Before pop:    " + s);
		System.out.println("Last element in stack: " + s.pop());
		System.out.println("After 1st pop: " + s);
		System.out.println("Last element in stack: " + s.pop());
		System.out.println("After 2nd pop: " + s);

		System.out.println();

		// 3. public Object peek()
		s.push(4);
		s.push(8);
		s.push(3);
		System.out.println("Before peek: " + s);
		System.out.println("Last element in stack: " + s.peek());
		System.out.println("After  peek: " + s);

		System.out.println();

		// 4. public int search(Object element)
		System.out.println("Position of 8: " + s.search(8));
		System.out.println("Position of 2: " + s.search(2));
		System.out.println("Position of 9: " + s.search(9));
	}

}
