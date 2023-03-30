package userThreads;

public class Main {

	public static void main(String[] args) {
		myThread2 t2 = new myThread2();
		Thread t = new Thread(t2);
		myThread1 t1 = new myThread1();
		t1.start();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);
		}
	}

}
