package TreeSet;

public class Student implements Comparable<Student> {

	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
