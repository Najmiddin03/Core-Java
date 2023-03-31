package Deadlock;

public class RegisterCourse extends Thread {

	Object courseName;
	Object trainerName;

	public RegisterCourse(Object course, Object trainer) {
		courseName = course;
		trainerName = trainer;
	}

	public void run() {
		synchronized (courseName) {
			System.out.println("Has course Name");
			synchronized (trainerName) {
				System.out.println("Register success");
			}
		}
	}
}
