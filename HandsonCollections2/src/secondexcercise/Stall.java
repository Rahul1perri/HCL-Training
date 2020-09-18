package secondexcercise;

public class Stall {
private String name;
private String detail;
private String type;
private String ownerName;

public Stall() {
	
}

protected Stall(String name, String detail, String type, String ownerName) {
	super();
	this.name = name;
	this.detail = detail;
	this.type = type;
	this.ownerName = ownerName;
}

protected String getName() {
	return name;
}

protected void setName(String name) {
	this.name = name;
}

protected String getDetail() {
	return detail;
}

protected void setDetail(String detail) {
	this.detail = detail;
}

protected String getType() {
	return type;
}

protected void setType(String type) {
	this.type = type;
}

protected String getOwnerName() {
	return ownerName;
}

protected void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public void  display() {
	System.out.println(" ");
	 System.out.format("%-15s %-20s %-15s %s",name,detail,type,ownerName);
	 
}

}
