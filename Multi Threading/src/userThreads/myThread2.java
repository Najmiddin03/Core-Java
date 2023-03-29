package userThreads;

public class myThread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread2 " + i);
		}

	}

}
