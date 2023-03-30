package ThreadMethods;

public class Main {

	public static void main(String[] args) {
		Thread t = new Thread();

		// setName(String name)
		t.setName("myThread");

		// getName()
		System.out.println("Thread name: " + t.getName());

		// setPriority(int priorityValue);
		// priorityValue must be [1,10]
		// If the requirement is not satisfied:
		try {
			System.out.println("\nException for not satisfying the requirement");
			t.setPriority(-5);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
		// Thread class has three variables
		System.out.println("Max priority value: " + Thread.MAX_PRIORITY);
		System.out.println("Norm priority value: " + Thread.NORM_PRIORITY);
		System.out.println("Min priority value: " + Thread.MIN_PRIORITY);
		t.setPriority(Thread.MAX_PRIORITY);

		// getPriority()
		System.out.println("Thread priority value: " + t.getPriority());
	}

}
