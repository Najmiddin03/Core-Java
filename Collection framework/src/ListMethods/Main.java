package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 1. public void add(int index, Object element)
		list.add("AAA");
		list.add("CCC");
		list.add(1, "BBB");
		System.out.println(list);

		System.out.println();

		// 2. public void addAll(int index, Collection c)
		List<String> list2 = new ArrayList<>();
		list2.add("XXX");
		list2.add("YYY");
		System.out.println("Before addAll(): " + list);
		list.addAll(2, list2);
		System.out.println("After  addAll(): " + list);

		System.out.println();

		// 3. public Object set(int index, Object element)
		System.out.println("Replaced String: " + list.set(2, null));
		System.out.println("List: " + list);

		System.out.println();

		// 4. public Object get(int index)
		System.out.println("1st object: " + list.get(0));
		System.out.println("3rd object: " + list.get(2));

		System.out.println();

		// 5. public void remove(int index)
		System.out.println("Before remove(): " + list);
		list.remove(2);
		System.out.println("After  remove(): " + list);

		System.out.println();

		// 6. public int indexOf(Object element)
		System.out.println("Index of CCC: " + list.indexOf("BBB"));
		System.out.println("Index of XXX: " + list.indexOf("YYY"));
		System.out.println("Index of ???: " + list.indexOf("???"));

		System.out.println();

		// 7. public int lastIndexOf(Object element)
		list.add("BBB");
		System.out.println("Index of BBB:      " + list.indexOf("BBB"));
		System.out.println("Last index of BBB: " + list.lastIndexOf("BBB"));

	}

}
