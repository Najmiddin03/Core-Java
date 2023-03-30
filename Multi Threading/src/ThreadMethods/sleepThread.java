package ThreadMethods;

public class sleepThread extends Thread {
	int time;

	public sleepThread(int time) {
		this.time = time;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("sleepThread");
		}
	}
}
