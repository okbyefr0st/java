package lti.banking;

public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transactions[] txns;
	protected int idx;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating Transactions array for the account...
		txns = new Transactions[10];
		// Adding opening account transactions...
		txns[idx++] = new Transactions("OB", balance, balance);

	}

	public void summary() {
		System.out.println("A/C No: " + accNo);
		System.out.println("Holder Name: " + holder);
		System.out.println("Balance:  " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transactions("Cr", amount, balance);

	}

	public abstract void withdraw(double amount) throws BalanceException;
	
	public void statement() {
		
		System.out.println("Statement of A/C: " + accNo);
		for(int i=0; i<idx;i++) {
			System.out.println(txns[i]);
		}
	}
	// {
	// if (amount<=balance)
	// balance-=amount;
	// else
	// System.out.println("Insufficient funds...!!!");
	// }
}
