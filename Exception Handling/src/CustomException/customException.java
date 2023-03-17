package CustomException;

public class customException {

	public static void main(String[] args) {
		Account ac1 = new Account("Najmiddin", 6000);
		Transactions t1 = new Transactions("a111");
		t1.withdraw(ac1, 300);
		t1.withdraw(ac1, 1500);
		t1.withdraw(ac1, 5000);
	}

}
