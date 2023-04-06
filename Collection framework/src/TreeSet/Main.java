package TreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Constructors
		// Cons - 1
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(9);
		ts.add(7);
		ts.add(3);
		ts.add(2);

		// Cons - 2
		TreeSet<Integer> ts2 = new TreeSet<>(ts);
		System.out.println("ts:  " + ts);
		System.out.println("ts2: " + ts2);

		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(6);
		al.add(456);
		al.add(3);
		al.add(6);

		// Cons - 3
		TreeSet<Integer> ts3 = new TreeSet<>(al);
		System.out.println("Array List: " + al);
		System.out.println("Tree Set:   " + ts3);

		// Cons - 4
		StringBuffer b1 = new StringBuffer("AAA");
		StringBuffer b2 = new StringBuffer("BAA");
		StringBuffer b3 = new StringBuffer("CAA");
		StringBuffer b4 = new StringBuffer("DAA");
		StringBuffer b5 = new StringBuffer("EAA");
		MyComparator myComp = new MyComparator();
		TreeSet<StringBuffer> ts4 = new TreeSet<StringBuffer>(myComp);
		ts4.add(b5);
		ts4.add(b4);
		ts4.add(b3);
		ts4.add(b2);
		ts4.add(b1);
		System.out.println(ts4);

		// User defined elements
		Student s1 = new Student("Naji");
		Student s2 = new Student("Muhiddin");
		Student s3 = new Student("Kamol");
		Student s4 = new Student("Jahongir");
		TreeSet<Student> st = new TreeSet<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		System.out.println(st);

		// Anonymous inner comparator class
		Comparator<Student> myComp2 = new Comparator<Student>() {

			@Override
			public int compare(Student std1, Student std2) {
				return -std1.name.compareTo(std2.name);
			}
		};
		TreeSet<Student> ts5 = new TreeSet<>(myComp2);
		ts5.add(s1);
		ts5.add(s2);
		ts5.add(s3);
		ts5.add(s4);
		System.out.println(ts5);

		// Anonymous inner comparator class 2
		TreeSet<Student> ts6 = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student std1, Student std2) {
				return -std1.name.compareTo(std2.name);
			}
		});
		ts6.add(s1);
		ts6.add(s2);
		ts6.add(s3);
		ts6.add(s4);
		System.out.println(ts6);

	}

}
