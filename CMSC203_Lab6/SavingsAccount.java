package LAB6;

public class SavingsAccount extends BankAccount{
	// Class Variables
		private double rate = 0.0025;
		private int savingsNumber = 0;
		private String accountNumber;

		
		public SavingsAccount(String N, double B) {
			// Initialize BankAccount
			super(N, B);
			this.accountNumber = super.getAccountNumber();
			this.setAccountNumber(this.accountNumber);
		}

		public SavingsAccount(BankAccount A, double B) {
			// Initialize BankAccount
			super(A, B);
			this.savingsNumber++;
			this.accountNumber = super.getAccountNumber();
			this.setAccountNumber(this.accountNumber);
		}

		public void postInterest() {
			this.setBalance((this.getBalance() * this.rate) + this.getBalance());
		}

		public String getAccountNumber()
		{
			return this.accountNumber + "-" + savingsNumber;
		}
}
