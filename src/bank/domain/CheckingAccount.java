package bank.domain;

import bank.util.Interest;

public class CheckingAccount extends Account {

	public CheckingAccount(long accountnr, Interest interestType) {
		super(accountnr, interestType);
	}

}
