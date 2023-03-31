package Synchronization;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new myThread(a);
		Thread t2 = new myThread(a);
		t1.setName("AAA");
		t2.setName("BBBB");
		t1.start();
		t2.start();
		

	}

}
