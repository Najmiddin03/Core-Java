package Producer_Consumer_problem;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread p = new Produce(a);
		Thread c = new Consume(a);
		p.start();
		c.start();

	}

}
