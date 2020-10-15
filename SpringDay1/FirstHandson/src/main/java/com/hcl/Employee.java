package com.hcl;

import java.util.ArrayList;

public class Employee {
private String employeeName;
private ArrayList<String>  employeeMobileNumber;
private String employeeSalary;
private String employeeEmail;
private Address address;

public Employee() {
	
}

public Employee(String employeeName, ArrayList<String> employeeMobileNumber, String employeeSalary,
		String employeeEmail, Address address) {
	super();
	this.employeeName = employeeName;
	this.employeeMobileNumber = employeeMobileNumber;
	this.employeeSalary = employeeSalary;
	this.employeeEmail = employeeEmail;
	this.address = address;
}


public String getEmployeeName() {
	return employeeName;
}


public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}


public ArrayList<String> getEmployeeMobileNumber() {
	return employeeMobileNumber;
}



public void setEmployeeMobileNumber(ArrayList<String> employeeMobileNumber) {
	this.employeeMobileNumber = employeeMobileNumber;
}



public String getEmployeeSalary() {
	return employeeSalary;
}



public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
}


public String getEmployeeEmail() {
	return employeeEmail;
}


public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}


public void display() {
	
	System.out.println("The Employee details are");
	System.out.println("The name of the employee is "+employeeName);
	for(String number:employeeMobileNumber) {
	System.out.println("The mobile numbers of the employee is "+number);
	}
	System.out.println("The salary of the employee is "+employeeSalary);
	System.out.println("The email of the employee is "+employeeEmail);
	address.display();
	
}
}
