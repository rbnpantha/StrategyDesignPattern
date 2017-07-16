package bank.util;

public class SavingInterest implements Interest {

	@Override
	public double getInterest(double balance) {
		double interest = 0;
		if (balance < 1000) {
			interest = balance * 0.01;
		} else if ((balance > 1000) && (balance < 5000)) {
			interest = balance * 0.02;
		} else {
			interest = balance * 0.04;
		}
		return interest;
	}

}
