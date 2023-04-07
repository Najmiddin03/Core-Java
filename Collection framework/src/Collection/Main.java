package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		// 1. public boolean add(Object obj)
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.add("AAA"));// true
		System.out.println(hs.add("BBB"));// true
		System.out.println(hs.add("AAA"));// false, because "AAA" is already added

		System.out.println();

		// 2. public boolean addAll(Collection c)
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("XXX");
		hs2.add("YYY");
		System.out.println("Before addAll(): " + hs);
		hs.addAll(hs2);
		System.out.println("After addAll(): " + hs);

		System.out.println();

		// 3. public boolean removeAll(Collection c)
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(5);
		al2.add(7);
		System.out.println("Before removeAll(): " + al);
		al.removeAll(al2);
		System.out.println("After removeAll(): " + al);

		System.out.println();

		// 4. public boolean remove(Object obj)
		ArrayList<String> al4 = new ArrayList<>();
		al4.add("AAA");
		al4.add("BBB");
		al4.add("CCC");
		System.out.println(al4.remove("AAA"));// true
		System.out.println(al4.remove("EDWE"));// false, because this object doesn't exist in al4

		System.out.println();

		// 5. public boolean contains(Object obj)
		System.out.println(hs.contains("AAA"));// true, hs has "AAA"
		System.out.println(al.contains(6));// true, al has 6
		System.out.println(hs.contains("KE"));// false, hs doesn't have "KE"
		System.out.println(al.contains(3));// false, al doesn't have 3

		System.out.println();

		// 6. public boolean containsAll(Collection c)
		System.out.println(hs.containsAll(hs2));// true, hs contains hs2 completely
		System.out.println(al.containsAll(al2));// false, al doesn't contain al2

		System.out.println();

		// 7. public boolean retainAll(Collection c)
		System.out.println("hs : " + hs);
		System.out.println("hs2: " + hs2);
		hs.retainAll(hs2);
		System.out.println("hs after retainAll(): " + hs);

		System.out.println();

		// 8. public Object[] toArray()
		Object[] elements = al4.toArray();
		System.out.println("Object array:");
		for (Object c : elements) {
			System.out.println(c);
		}

		System.out.println();

		// 9.public int size()
		System.out.println("Size of hs: " + hs.size());
		System.out.println("Size of al: " + al.size());

		System.out.println();

		// 10. public boolean isEmpty()
		System.out.println("Is hs empty: " + hs.isEmpty());
		System.out.println("Is al empty: " + al.isEmpty());

		System.out.println();

		// 11. public void clear()
		al.clear();
		System.out.println("Is al empty now: " + al.isEmpty());

	}

}
