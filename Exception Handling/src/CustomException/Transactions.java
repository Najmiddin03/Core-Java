package CustomException;

public class Transactions {
	String transID;

	Transactions(String transID) {
		this.transID = transID;
	}

	public void withdraw(Account acc, int withdrawAmount) {
		System.out.println("=============================");
		System.out.println("Transaction ID " + transID);
		acc.print();
		try {
			if (withdrawAmount <= acc.balance) {
				acc.balance -= withdrawAmount;
				System.out.println("Transaction completed");
				System.out.println("Remaining amount " + acc.balance);
			} else {
				System.out.println("Transaction not completed");
				System.out.println("Account balance " + acc.balance);
				System.out.println("Withdraw amount " + withdrawAmount);
				throw new myException("Insufficient funds");
			}
		} catch (myException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("**********Thank you**********");
			System.out.println("*****************************\n");
		}

	}
}
