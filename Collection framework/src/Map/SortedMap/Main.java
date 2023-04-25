package Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		SortedMap<Integer, Integer> sm = new TreeMap<>();
		sm.put(5, 55);
		sm.put(9, 99);
		sm.put(2, 22);
		sm.put(3, 33);
		// Methods
		// 1. firstKey()
		System.out.println(sm);
		System.out.println(sm.firstKey());
		// 2. lastKey()
		System.out.println(sm.lastKey());

		// 3. headMap(Object key)
		SortedMap<Integer, Integer> sm2 = sm.headMap(5);
		System.out.println(sm2);
		// 4. tailMap(Object key)
		SortedMap<Integer, Integer> sm3 = sm.tailMap(5);
		System.out.println(sm3);
		// 5. subMap(Object fromKey, Object toKey)
		SortedMap<Integer, Integer> sm4 = sm.subMap(3, 6);
		System.out.println(sm4);

	}

}
