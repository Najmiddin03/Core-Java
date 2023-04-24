package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<>();
		// Methods
		// 1. put(Object key, Object value)
		System.out.println(m.put(5, 4));
		System.out.println(m.put(8, 4));
		System.out.println(m.put(7, 1));
		System.out.println(m.put(8, 5));

		// 2. putAll(Map map)
		Map<Integer, Integer> sm = new LinkedHashMap<>();
		sm.putAll(m);
		System.out.println(m);
		System.out.println(sm);

		// 3. get(Object key)
		System.out.println(m.get(8));
		System.out.println(m.get(1));

		// 4. remove(Object key)
		m.remove(8);
		System.out.println(m);
		m.remove(8);

		// 5. size()
		System.out.println(m.size());
		System.out.println(sm.size());

		// 6. clear()
		m.clear();
		System.out.println(m);

		// 7. isEmpty
		System.out.println(m.isEmpty());
		System.out.println(sm.isEmpty());

		// 8. containsKey(Object key)
		System.out.println(sm.containsKey(8));
		System.out.println(sm.containsKey(4));

		// 9. containsValue(Object value)
		System.out.println(sm.containsValue(4));

		// 10. keySet()
		Set<Integer> set = sm.keySet();
		System.out.println(set);

		// 11. values()
		Collection<Integer> c = sm.values();
		System.out.println(c);
	}

}
