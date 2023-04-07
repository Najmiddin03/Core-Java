package Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import Set.SortedSet.NavigableSet.TreeSet.MyComparator;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Cons - 1
		PriorityQueue<Integer> pq = new PriorityQueue<>();// capacity is 11
		pq.offer(5);
		pq.offer(7);
		pq.offer(6);

		// Cons - 2
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(5);// capacity is 5

		// Cons - 3
		MyComparator myComp = new MyComparator();
		PriorityQueue<StringBuffer> pq3 = new PriorityQueue<>(myComp);// with user defined comparator

		// Cons - 4
		PriorityQueue<Integer> pq4 = new PriorityQueue<>(pq);
		System.out.println("pq:  " + pq);
		System.out.println("pq4: " + pq4);

		SortedSet<Integer> s = new TreeSet<>();
		s.add(4);
		s.add(6);
		// Cons - 5
		PriorityQueue<Integer> pq5 = new PriorityQueue<>(s);
		System.out.println("Set:    " + s);
		System.out.println("Queue:  " + pq5);

		Vector<Integer> v = new Vector<>(s);
		v.add(15);
		// Cons - 6
		PriorityQueue<Integer> pq6 = new PriorityQueue<>(v);
		System.out.println("Vector: " + v);
		System.out.println("Queue:  " + pq6);
	}

}
