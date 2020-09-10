package secondexcercise;

public class SavingsAccount extends Account{

	private double minimumBalance;

	protected double getMinimumBalance() {
		return minimumBalance;
	}

	protected void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	protected SavingsAccount(double minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}

	protected SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected SavingsAccount(String accountNumber, double balance, String accountHolderName) {
		super(accountNumber, balance, accountHolderName);
	}
	
	void display() {
		super.display();
		System.out.println("The Minimum Balance is: "+minimumBalance );
	}
	
}
