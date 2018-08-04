package lti.banking;

public class Saving extends Account {

	public Saving() {

	}

	public Saving(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= balance) {
			balance -= amount;

			txns[idx++] = new Transactions("Dr", balance, balance);
		}

		else
			throw new BalanceException("Insufficient funds in saving acc");
	}

}
