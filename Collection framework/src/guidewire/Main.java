package guidewire;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String a = "#.#.#";
		String b = "#.##.";
		String c = ".#..#";
		String arr[] = { a, b, c };
		for (int x : solution2(arr)) {
			System.out.println(x);
		}
	}

	static int[] solution2(String[] B) {
		HashMap<Integer, Integer> h = new HashMap<>();
		int x = B[0].length();
		int y = B.length;
		int p = 0;
		int s = 0;
		int d = 0;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (B[i].charAt(j) == '#') {
					// check right
					if (j < x - 1 && B[i].charAt(j + 1) == '#') {
						// check more right
						if (j < x - 2 && B[i].charAt(j + 2) == '#') {
							h.put(i, j + 2);
							d++;
						}
						// check right below
						else if (j < x - 1 && i < y - 1 && B[i + 1].charAt(j + 1) == '#') {
							d++;
						}
						// check right up
						else if (j < x - 1 && i > 0 && B[i - 1].charAt(j + 1) == '#') {
							d++;
						} else {
							s++;
						}
					}
					// check below
					else if (i < y - 1 && B[i + 1].charAt(j) == '#') {
						// check more below
						if (i < y - 2 && B[i + 2].charAt(j) == '#') {
							d++;
						}
						// check right below
						else if (j < x - 1 && i < y - 1 && B[i + 1].charAt(j + 1) == '#') {
							d++;
						} else {
							s++;
						}
					} else {
						d++;
					}
				}
			}
		}

		int ans[] = { p, s, d };
		return ans;
	}

//	static public int solution3(int[] blocks) {
//		int max = 0;
//		for (int i = 0; i < blocks.length; i++) {
//			int smaller = i;
//			int bigger = i;
//			while (smaller > 0) {
//				if (blocks[smaller - 1] >= blocks[smaller]) {
//					smaller--;
//				} else {
//					break;
//				}
//			}
//			while (bigger < blocks.length - 1) {
//				if (blocks[bigger + 1] >= blocks[bigger]) {
//					bigger++;
//				} else {
//					break;
//				}
//			}
//			int range = bigger - smaller + 1;
//			if (max < range) {
//				max = range;
//			}
//		}
//		return max;
//	}
//
//	static boolean solution(String S) {
//		boolean b = false;
//		for (int i = 0; i < S.length(); i++) {
//			if (S.charAt(i) == 'b') {
//				b = true;
//			}
//			if (b && S.charAt(i) == 'a') {
//				return false;
//			}
//		}
//		return true;
//	}
}
