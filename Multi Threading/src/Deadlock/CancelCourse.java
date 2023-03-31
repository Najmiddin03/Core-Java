package Deadlock;

public class CancelCourse extends Thread {

	Object courseName;
	Object trainerName;

	public CancelCourse(Object course, Object trainer) {
		courseName = course;
		trainerName = trainer;
	}

	public void run() {
		synchronized (trainerName) {
			System.out.println("Has trainer Name");
			synchronized (courseName) {
				System.out.println("Cancel success");
			}
		}
	}
}
