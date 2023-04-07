package Set.SortedSet.NavigableSet.TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o1.charAt(0) - o2.charAt(0);
	}

}
