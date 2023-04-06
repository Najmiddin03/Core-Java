package Cursors_Iterators;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < 10; i++) {
			v.add(i + 1);
		}
		Enumeration<Integer> e = v.elements();
		System.out.println("Enumerator");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
