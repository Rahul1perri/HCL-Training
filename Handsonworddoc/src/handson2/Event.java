package handson2;

public class Event {
protected String name;
protected String detail;
protected String ownerName;
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

public double projectedRevenue() {
	return 0.0;
}
}
