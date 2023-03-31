package Deadlock;

public class Main {

	public static void main(String[] args) {
		Object course = new Object();
		Object trainer = new Object();
		Thread rc = new RegisterCourse(course, trainer);
		Thread cc = new CancelCourse(course, trainer);
		rc.start();
		cc.start();
	}

}
