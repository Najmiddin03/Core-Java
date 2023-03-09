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

		// Methods
		// 1. public int length()
		// Return length

		// 2. public int capacity()
		// Return capacity

		// 3. public String toString()
		// Return content of the StringBuffer object

		// 4. public void ensureCapacity()
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());
		sb4.ensureCapacity(6);
		System.out.println(sb4.capacity());
		sb4.ensureCapacity(19);
		System.out.println(sb4.capacity());
		sb4.ensureCapacity(65);
		System.out.println(sb4.capacity());

		// 5. public StringBuffer append(String str)
		StringBuffer sb5_1 = new StringBuffer("Neotron");
		System.out.println(sb5_1);
		StringBuffer sb5_2 = sb5_1.append(" Company");
		System.out.println(sb5_1);
		System.out.println(sb5_2);

		// 6. public StringBuffer reverse()
		StringBuffer sb6 = new StringBuffer("Neotron Company");
		System.out.println(sb6);
		sb6.reverse();
		System.out.println(sb6);

		// 7. public StringBuffer insert(int index, String str)
		StringBuffer sb7 = new StringBuffer("Halla");
		System.out.println(sb7);
		sb7.insert(3, "ol");
		System.out.println(sb7);

		// 8. public StringBuffer delete(int fromIndex, int toIndex)
		StringBuffer sb8 = new StringBuffer("Neotron");
		System.out.println(sb8);
		sb8.delete(3, 7);
		System.out.println(sb8);

		// 9. public StringBuffer deleteCharAt(int index)
		StringBuffer sb9 = new StringBuffer("Helllo");
		System.out.println(sb9);
		sb9.deleteCharAt(3);
		System.out.println(sb9);

		// 10. public StringBuffer replace(int startIndex, int endIndex, String str)
		StringBuffer sb10 = new StringBuffer("Hello");
		System.out.println(sb10);
		sb10.replace(2, 4, "y y");
		System.out.println(sb10);

		// 11. public void setLength()
		StringBuffer sb11 = new StringBuffer("Neotron");
		System.out.println(sb11 + "--->" + sb11.length());
		sb11.setLength(3);
		System.out.println(sb11 + "--->" + sb11.length());
		sb11.setLength(20);
		System.out.println(sb11 + "--->" + sb11.length());

		// 12. public StringBuffer setCharAt(int index, char ch)
		StringBuffer sb12 = new StringBuffer("neotron");
		System.out.println(sb12);
		sb12.setCharAt(0, 'N');
		sb12.setCharAt(3, 'T');
		System.out.println(sb12);

	}

}
