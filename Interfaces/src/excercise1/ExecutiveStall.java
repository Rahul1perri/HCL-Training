package excercise1;

public class ExecutiveStall implements Stall {
	private String stallName;
	private int cost;
	private String ownerName;
	private int screen;
	
	protected ExecutiveStall() {
		
	}

	protected ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
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

	protected int getScreen() {
		return screen;
	}

	protected void setScreen(int screen) {
		this.screen = screen;
	}
	
	public void display() {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: "+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("No of Screens: "+screen);
	}
	
	
	
	
	
	
}
