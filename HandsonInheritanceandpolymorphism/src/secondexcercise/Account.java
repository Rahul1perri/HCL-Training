package secondexcercise;

public class Account {
private String accountNumber;
private double balance;
private String accountHolderName;
protected String getAccountNumber() {
	return accountNumber;
}
protected void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
protected double getBalance() {
	return balance;
}
protected void setBalance(double balance) {
	this.balance = balance;
}
protected String getAccountHolderName() {
	return accountHolderName;
}
protected void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

protected Account() {
	
}
protected Account(String accountNumber, double balance, String accountHolderName) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.accountHolderName = accountHolderName;
}

void display() {
	System.out.println("The Account Number is: "+accountNumber+"The Balance is : "+balance+"The AccountHolderName: "+accountHolderName);
	
}
	
	

}
