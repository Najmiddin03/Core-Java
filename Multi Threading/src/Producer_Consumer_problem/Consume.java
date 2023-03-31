package Producer_Consumer_problem;

public class Consume extends Thread {
	A a;

	public Consume(A a) {
		this.a = a;
	}

	public void run() {
		a.consume();
	}
}
