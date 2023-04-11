package Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		// Methods
		// 1. public void addFirst(Object obj)
		// 2. public void offerFirst(Object obj)
		Deque<Integer> d = new ArrayDeque<>();
		d.addFirst(5);
		d.offerFirst(9);

		// 3. public void addLast(Object obj)
		// 4. public void offerLast(Object obj)
		d.addLast(5);
		d.offerLast(4);
		System.out.println(d);

		// 5. public Object removeFirst()
		// 6. public Object pollFirst()
		System.out.println(d.removeFirst());// exception if queue is empty
		System.out.println(d.pollFirst());// return null if queue is empty
		System.out.println(d);

		// 7. public Object removeLast()
		// 8. public Object pollLast()
		System.out.println(d.removeLast());// exception if queue is empty
		System.out.println(d.pollLast());// return null if queue is empty
		System.out.println(d);

		d.add(5);
		d.add(4);
		d.add(5);
		d.add(7);
		d.add(5);

		// 9. public Object getFirst()
		// 10.public Object peekFirst()
		System.out.println();
		System.out.println(d);
		System.out.println(d.getFirst());// exception if queue is empty
		System.out.println(d.peekFirst());// return null if queue is empty

		// 11. public Object getLast()
		// 12. public Object peekLast()
		System.out.println();
		System.out.println(d);
		System.out.println(d.getLast());// exception if queue is empty
		System.out.println(d.peekLast());// return null if queue is empty
		System.out.println();

		// 13. public boolean removeFirstOccurance(Object element)
		System.out.println(d);
		d.removeFirstOccurrence(5);
		System.out.println(d);

		// 14. public boolean removeLastOccurance(Object element)
		d.removeLastOccurrence(5);
		System.out.println(d);
		System.out.println();

		// 15. public Iterator iterator()
		Iterator<Integer> it = d.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		// 16. public Iterator descendingIterator()
		it = d.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
