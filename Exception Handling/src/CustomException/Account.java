package CustomException;

public class Account {
	String name;
	int balance;

	Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	void print() {
		System.out.println("Account name " + name);
		System.out.println("Account balance " + balance);
	}
}
