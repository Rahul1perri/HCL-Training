package fourthexcecise;

public class User {
private	String name;
private	String contactNumber;
private	String userName;
private	String email;

public User() {
	
}

protected User(String name, String contactNumber, String userName, String email) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.userName = userName;
	this.email = email;
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

protected String getUserName() {
	return userName;
}

protected void setUserName(String userName) {
	this.userName = userName;
}

protected String getEmail() {
	return email;
}

protected void setEmail(String email) {
	this.email = email;
}

void display() {
	System.out.println(" ");
	System.out.format("%-20s%-20s%-20s%-20s",name,contactNumber,userName,email);
}
}


