package ThirdExcercise;

public class Stall {
protected String name;
protected String detail;
protected String ownerName;

protected Stall() {
	
}
protected Stall(String name, String detail, String ownerName) {
	super();
	this.name = name;
	this.detail = detail;
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
protected String getOwnerName() {
	return ownerName;
}
protected void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public double ComputeCost(String stallType,Integer squareFeet) {
	if(stallType.contentEquals("Platinum")) {
		squareFeet=200*squareFeet;
	}else if(stallType.contentEquals("Diamond")){
		squareFeet=150*squareFeet;
	}else {
		squareFeet=100*squareFeet;
	}
	return squareFeet;
}

public double computeCost(String stallType,Integer squareFeet,Integer numberOfTv) {
	int x;
	if(stallType.contentEquals("Platinum")) {
		squareFeet=200*squareFeet;
		 x=numberOfTv*10000;
		x=x+squareFeet;
	}else if(stallType.contentEquals("Platinum")) {
		squareFeet=150*squareFeet;
		 x=numberOfTv*10000;
		 x=x+squareFeet;
	}else {
		squareFeet=100*squareFeet;
		 x=numberOfTv*10000;
		 x=x+squareFeet;
	}
	return x;
}

void display() {
	System.out.println(name);
	System.out.println(detail);
	System.out.println(ownerName);
}





}
