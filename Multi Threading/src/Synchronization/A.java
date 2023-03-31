package Synchronization;

public class A {
	synchronized void synchronizedMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	void synchronizedBlock() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Before sync: " + Thread.currentThread().getName());
		}
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("While sync: " + Thread.currentThread().getName());
			}
		}
	}

}
