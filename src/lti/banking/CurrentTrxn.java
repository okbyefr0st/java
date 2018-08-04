package lti.banking;

public class CurrentTrxn {
	private String type;
	private double amount, balance,overdraft;
	public CurrentTrxn() {
	}
	public CurrentTrxn(String type, double amount, double balance, double overdraft) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance + "\t"+overdraft;
	}
	
	
	

}
