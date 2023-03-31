package Producer_Consumer_problem;

public class Produce extends Thread {
	A a;

	public Produce(A a) {
		this.a = a;
	}

	public void run() {
		a.produce();
	}

}
