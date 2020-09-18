package thirdexcercise;

public class Hall implements Comparable<Hall>{
    private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	
	public Hall() {
		
	}
	protected Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getContactNumber() {
		return contactNumber;
	}
	protected void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	protected double getCostPerDay() {
		return costPerDay;
	}
	protected void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	protected String getOwnerName() {
		return ownerName;
	}
	protected void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public String toString() {
		System.out.println(" ");
		System.out.format("%-15s%-15s%-15s%-15s",name,contactNumber,costPerDay,ownerName);
		return "";
		
	}
@Override
	public int compareTo(Hall o) {
	double COstPerDay=this.costPerDay;
	double cp2 =o.costPerDay;
	if(COstPerDay<cp2) {
		return -1;
	}else if(COstPerDay>cp2) {
		return 1;
	}else
		return 0;	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
