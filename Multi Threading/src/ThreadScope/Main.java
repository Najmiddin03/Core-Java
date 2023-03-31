package ThreadScope;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread1(a);
		Thread t2 = new Thread2(a);
		t1.start();
		t2.start();
	}
}
