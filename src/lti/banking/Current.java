package lti.banking;

class Current extends Account {
	public Current() {

	}

	private double overdraft;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT)
			balance += overdraft - OVERDRAFT_AMT;
		overdraft = OVERDRAFT_AMT;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= balance + overdraft && amount <= super.balance) {
			super.balance -= amount;
		} else if (amount <= balance + overdraft && amount > super.balance) {
			amount = amount - super.balance;
			overdraft = overdraft - amount;
			super.balance = MIN_CUR_BAL;
		}

		else {
			throw new BalanceException("Insufficient funds in current acc");
		}
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft available" + overdraft);

	}

}