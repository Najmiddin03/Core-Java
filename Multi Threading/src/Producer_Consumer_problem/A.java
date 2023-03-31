package Producer_Consumer_problem;

public class A {
	boolean flag = true;
	int item = 0;

	synchronized void produce() {
		while (true) {
			if (flag) {
				System.out.println("Item produced: " + (++item));
				flag = false;
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	synchronized void consume() {
		while (true) {
			try {
				if (flag) {
					wait();
				} else {
					System.out.println("Item consumed: " + item);
					flag = true;
					notify();
					wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
