package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee employee1=context.getBean(Employee.class,"employee");
	Address adress1=employee1.getAddress();
	employee1.display();
	
	((AbstractApplicationContext) context).close();
	
	}

}
