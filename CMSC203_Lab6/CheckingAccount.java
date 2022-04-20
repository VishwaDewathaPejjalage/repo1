package LAB6;

public class CheckingAccount extends BankAccount{
	// Class Variables
		private double FEE = 0.15;
		private String accountNumber;

		
		public CheckingAccount(String N, double B) {
			// Initialize BankAccount
			super(N, B);
			this.accountNumber = this.getAccountNumber() + "-10";
			this.setAccountNumber(this.accountNumber);
		}

		public boolean withdraw(double A) {
			// Checks
			if (A > this.getBalance()) { return false; }
			if (A + (this.FEE) > this.getBalance()) { return false; }

			// Variables
			boolean result = super.withdraw(A + (this.FEE));

			// Return
			return result;
		}
}
