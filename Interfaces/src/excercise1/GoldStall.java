package excercise1;

public class GoldStall implements Stall {

	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;
	
	protected GoldStall() {
		
	}
	protected GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
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
	protected int getTvSet() {
		return tvSet;
	}
	protected void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	
	public void display() {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: "+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("numberoftvSet: "+tvSet);
	}
	
	
	
	
	
	
	
	
	
	
	
}
