package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class exception {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		// "throw" keyword
		int mark;
		mark = sc.nextInt();
		if (mark > 100 || mark < 0) {
			throw new RuntimeException("Invalid value");
			// mark = 52; ---> We can't write anything immediately after "throw" keyword
			// because program never reaches here
		}
		if (mark == 50) {
			mark = 100 / 0;// we have arithmetic exception here
			System.out.println(mark);// but compiler is so dumb that it will not recognize the exception
			// that's why we can still use statements after built-in exception, even it will
			// never be reached
		}
		if (mark == 60) {
			add();
		}

		// try-catch
		try {
			int i = 100 / 0;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e);
			System.out.println();
			System.out.println(e.getMessage());
		}

		// try-catch-finally
		mark = tryCatch();
		System.out.println(mark);

		// try-catch-finally with multiple catch
		try {

		} catch (ArithmeticException e) {

		} catch (NullPointerException e) {

		} catch (ArrayIndexOutOfBoundsException e) {

		}

		// if exceptions are related, they should be arranged in order
		try {

		} catch (ArithmeticException e) {

		} catch (RuntimeException e) {

		} catch (Exception e) {

		} catch (Throwable e) {

		}

		// multi-catch block
		try {

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {

		} // here all exception should be independent, not related to each other

//		try { 
//		  
//		} catch (Exception|ArithmeticException e) { ---> error
//			
//		}

		// try-with-resources
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter data");
			String data = br.readLine();
			System.out.println(data);
		} catch (Exception e) {

		}

	}

	static void add() throws IOException {// intention of "throws" keyword is to bypass the generated
											// exception from present method to caller method
		throw new IOException("My exception");
	}

	static int tryCatch() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
		// return 40; ---> unreachable statement
	}
}
