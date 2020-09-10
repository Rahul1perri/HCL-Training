package excercise1;

public class PremiumStall implements Stall {
private String stallName;
private int cost;
private String ownerName;
private int projector;

protected PremiumStall() {
	
}

protected PremiumStall(String stallName, int cost, String ownerName, int projector) {
	super();
	this.stallName = stallName;
	this.cost = cost;
	this.ownerName = ownerName;
	this.projector = projector;
}

protected String getStallName() {
	return stallName;
}

protected void setStallName(String stallName) {
	this.stallName = stallName;
}

protected int getCost() {
	return cost;
}

protected void setCost(int cost) {
	this.cost = cost;
}

protected String getOwnerName() {
	return ownerName;
}

protected void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

protected int getProjector() {
	return projector;
}

protected void setProjector(int projector) {
	this.projector = projector;
}
public void display() {
	System.out.println("Stall Name: "+stallName);
	System.out.println("Cost: "+cost);
	System.out.println("Owner Name: "+ownerName);
	System.out.println("No of Projectors: "+projector);
}
}
