package bank.util;

public class CheckingInterest implements Interest {

	@Override
	public double getInterest(double balance) {
		double interest = 0;
		if (balance < 1000) {
			interest = balance * 0.015;
		} else {
			interest = balance * 0.025;
		}
		return interest;
	}

}
