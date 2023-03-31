package ThreadScope;

public class Thread2 extends Thread {
	static ThreadScope threadScope = new ThreadScope();
	A a;

	public Thread2(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		threadScope.set("BBB");
		a.m2();
	}
}
