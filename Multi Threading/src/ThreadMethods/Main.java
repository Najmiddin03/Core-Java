package ThreadMethods;

public class Main {

	public static void main(String[] args) throws InterruptedException {
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

		// static activeCount() - returns the number of Threads in process
		System.out.println("\nOnly main Thread is active:   " + Thread.activeCount());
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t.start();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Number of Threads are active: " + Thread.activeCount());

		// isAlive()
		System.out.println("\nIs " + t.getName() + " Alive: " + t.isAlive());
		System.out.println("Is " + t1.getName() + " Alive: " + t1.isAlive());
		System.out.println("Is " + t2.getName() + " Alive: " + t2.isAlive());
		System.out.println("Is " + t3.getName() + " Alive: " + t3.isAlive());

		// static currentThread()
		System.out.println("\nCurrently running Thread is: " + Thread.currentThread().getName());

		// static sleep(long time)
		System.out.println();
		Thread sleepTh = new sleepThread(10);
		sleepTh.start();
		// join()
		sleepTh.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		// Daemon Threads
		// setDaemon(boolean b)
		Thread t4 = new Thread();
		t4.setDaemon(true);

		// isDaemon()
		System.out.println("\nIs " + t4.getName() + " Daemon: " + t4.isDaemon());
	}

}
