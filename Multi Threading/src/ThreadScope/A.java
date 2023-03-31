package ThreadScope;

public class A {

	void m1() {
		System.out.println("m1(): " + Thread.currentThread().getName() + " scope: " + Thread1.threadScope.get());
		System.out.println("m1(): " + Thread.currentThread().getName() + " scope: " + Thread2.threadScope.get());
	}

	void m2() {
		System.out.println("m2(): " + Thread.currentThread().getName() + " scope: " + Thread2.threadScope.get());
		System.out.println("m2(): " + Thread.currentThread().getName() + " scope: " + Thread1.threadScope.get());
	}
}
