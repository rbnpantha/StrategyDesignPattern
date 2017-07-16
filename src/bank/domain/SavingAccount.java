package bank.domain;

import bank.util.Interest;

public class SavingAccount extends Account {

	public SavingAccount(long accountnr, Interest interestType) {
		super(accountnr, interestType);
	}

}
