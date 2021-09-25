
public class saving extends acc {
	double interestRate;

	public boolean ZakaathCheck() {
		if (balance <= 20000) {
			return false;
		} else {
			return true;
		}
	}

	public double CalculateZakaath() {
		return (balance * 2.5) / 100;
	}

	public double calculateInterest() {
		double intr = (interestRate / 100) * balance;
		return intr;
	}

	public void setInterestRate(double rate) {
		interestRate = rate;
	}
}
