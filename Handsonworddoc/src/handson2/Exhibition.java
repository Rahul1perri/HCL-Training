package handson2;

public class Exhibition extends Event {

	protected int noOfStall;

	protected int getNoOfStall() {
		return noOfStall;
	}

	protected void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}
	
	public double projectedRevenue() {
		double r=noOfStall*10000;
		return r;
	}
	
	
	
	
	
	
}
