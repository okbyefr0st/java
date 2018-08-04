package lti.banking;

public class Transactions {
	private String type;
	private double amount, balance;

	public Transactions() {
	}

	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance;
	}

}
