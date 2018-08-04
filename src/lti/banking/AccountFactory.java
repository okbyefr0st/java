package lti.banking;

public final class AccountFactory {
	private AccountFactory() {
		 
	}
	public static Bank openAccount(String type, String holder) {
		Bank acnt = null;
		if (type.equalsIgnoreCase("saving"))
			acnt = new Saving(holder);
		else
			acnt = new Current(holder);
		return acnt;
	}
}
