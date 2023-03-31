package ThreadScope;

public class Thread1 extends Thread {
	static ThreadScope threadScope = new ThreadScope();
	A a;

	public Thread1(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		threadScope.set("AAA");
		a.m1();
	}
}
