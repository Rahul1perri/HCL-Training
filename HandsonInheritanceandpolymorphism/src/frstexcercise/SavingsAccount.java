package frstexcercise;

public class SavingsAccount extends Account{

	private String orgName;

	protected SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected SavingsAccount(String accName, String accNo, String bankName) {
		super(accName, accNo, bankName);
		// TODO Auto-generated constructor stub
	}

	protected SavingsAccount(String orgName) {
		super();
		this.orgName = orgName;
	}

	protected String getOrgName() {
		return orgName;
	}

	protected void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	void display() {
		super.display();
		System.out.println("The Organization Name is: "+orgName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
