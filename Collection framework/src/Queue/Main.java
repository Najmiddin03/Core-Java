package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		// Methods
		// 1. public void offer(Object element)
		q.offer(5);
		q.offer(6);
		System.out.println(q);

		// 2. public Object poll()
		System.out.println("Head element: " + q.poll());
		System.out.println("New queue: " + q);
		// 3. public Object remove()
		System.out.println("Head element: " + q.remove());
		System.out.println("New queue: " + q);

		// Difference between poll() and remove()
		System.out.println("\npoll()   on empty queue: " + q.poll());
		try {
			System.out.println("remove() on empty queue:");
			q.remove();
		} catch (Exception e) {
			e.printStackTrace();
		}

		q.offer(8);
		q.offer(4);
		q.offer(6);
		q.offer(7);

		// 4. public Object peek()
		// 5. public Object element()
		System.out.println("Queue: " + q);
		System.out.println("Head element: " + q.peek());
		System.out.println("Head element: " + q.element());
		System.out.println("Queue after peek() and element(): " + q);

		// Difference between peek() and element()
		Queue<Integer> q2 = new ArrayDeque<>();
		System.out.println("\npeek() on empty queue: " + q2.peek());
		try {
			System.out.println("element() on empty queue:");
			q2.element();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
