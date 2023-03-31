package Synchronization;

public class myThread extends Thread {
	A a;

	public myThread(A a) {
		this.a = a;
	}

	public void run() {
		a.synchronizedMethod();
		System.out.println();
		a.synchronizedBlock();
	}
}
