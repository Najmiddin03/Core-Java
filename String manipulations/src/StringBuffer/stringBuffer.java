package StringBuffer;

public class stringBuffer {

	public static void main(String[] args) {
		// Cons 1 - public StringBuffer()
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());

		// Cons 2 - public StringBuffer(int capacity)
		StringBuffer s2 = new StringBuffer(32);
		System.out.println(s2.capacity());

		// Cons 3 - public StringBuffer(String str)
		StringBuffer s3 = new StringBuffer("Hello");
		System.out.println(s3);
		System.out.println(s3.capacity());// 21 - reason: 16+length()
		System.out.println(s3.length());// 5

	}

}
