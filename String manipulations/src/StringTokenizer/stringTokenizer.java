package StringTokenizer;

import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {
		// Cons 1 - public StringTokenizer(String str)
		StringTokenizer st = new StringTokenizer("Neotron Company");

		// public int countTokens()
		System.out.println(st.countTokens());

		// public boolean hasMoreTokens()
		System.out.println(st.hasMoreTokens());

		// public String nextToken()
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + " " + st.countTokens());
		}

		// Cons 2 - public StringTokenizer(String str, String delimiter)
		st = new StringTokenizer("Neotron Company", "o");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + " " + st.countTokens());
		}

	}

}
