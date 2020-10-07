package org.hcl;

import org.hcl.*;
import org.util.*;
import org.dao.*;
import java.io.*;
import java.util.List;
public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee emp=new Employee();
DBDao db=new DBDaoImp();
int e=Integer.parseInt(br.readLine());
System.out.println("Choose the options to perform\n 1.Insert\n 2.Delete\n 3.Get Details\n 4.Get the List");
switch(e) {
case 1:
boolean inserted=db.insert(emp);
	System.out.println(inserted);
	break;
case 2:
	System.out.println("Enter the Employee name whose details you want to delete");
	String name=br.readLine();
	boolean deleted=db.delete(name);
	System.out.println(deleted);
	break;
case 3:
	System.out.println("Enter the Employee name whose details you want to view");
	String NAME=br.readLine();
	Employee E=db.get(NAME);
	System.out.println(E);
	break;
case 4:
	List<Employee> EMP=db.getAll();
	System.out.println(EMP);
	break;
	}

	}

}
