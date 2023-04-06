package Cursors_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Iterator<Integer> it = list.iterator();
		System.out.println("Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
