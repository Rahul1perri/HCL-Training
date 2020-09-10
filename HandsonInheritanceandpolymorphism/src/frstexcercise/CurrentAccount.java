package frstexcercise;

public class CurrentAccount extends Account {

	private String tinNumber;

	protected CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected CurrentAccount(String accName, String accNo, String bankName) {
		super(accName, accNo, bankName);
		// TODO Auto-generated constructor stub
	}

	protected CurrentAccount(String tinNumber) {
		super();
		this.tinNumber = tinNumber;
	}

	protected String getTinNumber() {
		return tinNumber;
	}

	protected void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	
	void display() {
		super.display();
		System.out.println("The TIN number is: "+tinNumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
