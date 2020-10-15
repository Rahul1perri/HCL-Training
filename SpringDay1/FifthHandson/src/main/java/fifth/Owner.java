package fifth;

import org.springframework.stereotype.Component;

@Component("rahul")
public class Owner {
private String name;
private String password;
private String mobileNumber;

public Owner() {
	
}

public Owner(String name, String password, String mobileNumber) {
	super();
	this.name = name;
	this.password = password;
	this.mobileNumber = mobileNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}


public void setDetails(String name,String password,String mobileNumber)  {
	this.name=name;
	this.password=password;
	this.mobileNumber=mobileNumber;
}

public void display() {
	System.out.println("The name is: "+name);
	System.out.println("The password is: "+password);
	System.out.println("The mobile number is: "+mobileNumber);
}
}
