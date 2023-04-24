package Map.HashMap;

import java.util.HashMap;

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String args[]) {
		// Constructors
		// Cons - 1
		HashMap hm1 = new HashMap<>();

		// Cons - 2
		HashMap hm2 = new HashMap<>(32);

		// Cons - 3
		HashMap hm3 = new HashMap<>(32, 0.5f);

		// Cons - 4
		HashMap hm4 = new HashMap<>(hm1);

	}
}
