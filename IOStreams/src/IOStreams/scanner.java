package IOStreams;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		short sh = sc.nextShort();
		int i = sc.nextInt();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		// difference between nextLine() and next()
		String str1 = sc.next();
		String str2 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		sc.close();

	}

}
