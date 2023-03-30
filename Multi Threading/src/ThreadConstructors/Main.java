package ThreadConstructors;

public class Main {

	public static void main(String[] args) {
		// Cons - 1
		Thread t1 = new Thread();
		System.out.println("Cons-1: " + t1);

		// Cons - 2
		Thread t2 = new Thread("myThread");
		System.out.println("Cons-2: " + t2);

		// Cons - 3
		Runnable r = new Thread();
		Thread t3 = new Thread(r);
		System.out.println("Cons-3: " + t3);

		// Cons - 4
		Thread t4 = new Thread(r, "myThread");
		System.out.println("Cons-4: " + t4);

		// Cons - 5
		ThreadGroup tg = new ThreadGroup("Java");
		Thread t5 = new Thread(tg, "myThread");
		System.out.println("Cons-5: " + t5);

		// Cons - 6
		Thread t6 = new Thread(tg, r);
		System.out.println("Cons-6: " + t6);

		// Cons - 7
		Thread t7 = new Thread(tg, r, "myThread");
		System.out.println("Cons-7: " + t7);
	}

}
