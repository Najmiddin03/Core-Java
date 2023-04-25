package Map.SortedMap.NavigableMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		NavigableMap<Integer, Integer> nm = new TreeMap<>();
		nm.put(8, 88);
		nm.put(2, 22);
		nm.put(1, 11);
		nm.put(9, 99);
		nm.put(5, 55);
		System.out.println(nm);
		// Methods
		// 1. descendingMap()
		NavigableMap<Integer, Integer> nm2 = nm.descendingMap();
		System.out.println(nm2);
		// 2. descendingKeySet()
		NavigableSet<Integer> ns = nm.descendingKeySet();
		System.out.println(ns);

		// 3. ceilingEntry(Object key)
		Map.Entry<Integer, Integer> e = nm.ceilingEntry(5);
		System.out.println(e);
		// 4. ceilingKey(Object key)
		Integer key = nm.ceilingKey(5);
		System.out.println(key);
		// 5. higherEntry(Object key)
		e = nm.higherEntry(5);
		System.out.println(e);
		// 6. higherKey(Object key)
		key = nm.higherKey(5);
		System.out.println(key);

		// 7. floorEntry(Object key)
		e = nm.floorEntry(8);
		System.out.println(e);
		// 8. floorKey(Object key)
		key = nm.floorKey(8);
		System.out.println(key);
		// 9. lowerEntry(Object key)
		e = nm.lowerEntry(8);
		System.out.println(e);
		// 10. lowerKey(Object key)
		key = nm.lowerKey(8);
		System.out.println(key + "\n");

		// 11. pollFirstEntry()
		System.out.println(nm.pollFirstEntry());
		System.out.println(nm);
		// 12. pollLastEntry()
		System.out.println(nm.pollLastEntry());
		System.out.println(nm);

	}

}
