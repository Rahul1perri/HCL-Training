package secondexcercise;

public class ItemType {
private String name;
private double deposit	;
private double costPerDay ;

public ItemType() {
	
}

protected ItemType(String name, double deposit, double costPerDay) {
	super();
	this.name = name;
	this.deposit = deposit;
	this.costPerDay = costPerDay;
}

protected String getName() {
	return name;
}

protected void setName(String name) {
	this.name = name;
}

protected double getDeposit() {
	return deposit;
}

protected void setDeposit(double deposit) {
	this.deposit = deposit;
}

protected double getCostPerDay() {
	return costPerDay;
}

protected void setCostPerDay(double costPerDay) {
	this.costPerDay = costPerDay;
}

public String toString() {
	System.out.format("%-20s%-20s%-20s",name,deposit,costPerDay);
	return " ";
}


}
