package lti.testcase;

import lti.banking.AccountFactory;
import lti.banking.BalanceException;
import lti.banking.Bank;

public class TestAccount {

	public static void main(String[] args) {
		// Account ac = new Account("Polo", 5000);
		// ac.summary();
		// ac.deposit(3000);
		// System.out.println(ac.getBalance());
		//
		// ac.withdraw(4000);
		// System.out.println(ac.getBalance());
		//
		// ac.withdraw(7000);
		// Saving sc = new Saving("Patil");
		// sc.summary();
		//
		// Current cs = new Current("LADPATIL");
		// cs.withdraw(3000);
		// cs.summary();
		// cs.withdraw(5000);
		// cs.summary();

		Bank sav = AccountFactory.openAccount("savings", "Ragini");
		sav.summary();

		sav.deposit(2000);
		sav.deposit(4000);
		try {
			sav.withdraw(15000);
		} catch (BalanceException e) {
			// e.printStackTrace();
			System.out.println(e);
		}
		try {
			sav.withdraw(15000);
		} catch (BalanceException e) {
			// e.printStackTrace(); // for developers to troubleshoot
			// System.out.println(e);// for logging purpose to audit

			System.out.println(e.getMessage());// end user

		}

		//sav.statement();

		// Account cre = new Current("Abhishek");
		// cre.summary();
		//
		// cre.deposit(2000);
		// cre.deposit(4000);
		// cre.withdraw(3000);
		// cre.withdraw(7000);
		
	}

}
