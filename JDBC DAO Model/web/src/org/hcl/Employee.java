package org.hcl;

public class Employee {
	
private String name;
private String address;
private String location;
 
 public Employee() {
}

public Employee(String name, String address, String location) {
	super();
	this.name = name;
	this.address = address;
	this.location = location;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", location=" + location + "]";
}

}
