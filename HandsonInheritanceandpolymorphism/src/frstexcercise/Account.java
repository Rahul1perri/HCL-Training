package frstexcercise;

public class Account {
private String accName;
private String accNo;
private String bankName;
protected String getAccName() {
	return accName;
}
protected void setAccName(String accName) {
	this.accName = accName;
}
protected String getAccNo() {
	return accNo;
}
protected void setAccNo(String accNo) {
	this.accNo = accNo;
}
protected String getBankName() {
	return bankName;
}
protected void setBankName(String bankName) {
	this.bankName = bankName;
}
protected Account() {
	
}

protected Account(String accName, String accNo, String bankName) {
	super();
	this.accName = accName;
	this.accNo = accNo;
	this.bankName = bankName;
}
 void display() {
	System.out.println("The Account Name is: "+accName);
	System.out.println("The Account Number is: "+accNo);
	System.out.println("The Bank Name is: "+bankName);
	}


}
