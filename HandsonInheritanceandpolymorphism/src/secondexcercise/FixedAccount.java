package secondexcercise;

public class FixedAccount extends SavingsAccount {
private int lockingPeriod;

protected int getLockingPeriod() {
	return lockingPeriod;
}

protected void setLockingPeriod(int lockingPeriod) {
	this.lockingPeriod = lockingPeriod;
}

protected FixedAccount(int lockingPeriod) {
	super();
	this.lockingPeriod = lockingPeriod;
}

protected FixedAccount() {
	super();
	
}
void display() {
	super.display();
	System.out.println("The Locking Period is: "+lockingPeriod);
}





}
