package ClassandobjectFrstExcercise;

import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Product Details:");

Product item1= new Product();
Product item2= new Product();

	System.out.println("Enter ProductCode");
	int ProductCode=sc.nextInt();
	item1.setProduct_code(ProductCode);
	System.out.println("Enter productName");
	String Productname=sc.next();
	item1.setProduct_name(Productname);
	System.out.println("Enter Price");
	double Price=sc.nextDouble();
	item1.setPrice(Price);
	System.out.println("Enter Stock");
	int Stock=sc.nextInt();
    item1.setStock(Stock);
    
    System.out.println("Enter ProductCode");
	int Productcode=sc.nextInt();
	item2.setProduct_code(Productcode);
	System.out.println("Enter productName");
	String ProductName=sc.next();
	item2.setProduct_name(ProductName);
	System.out.println("Enter Price");
	double PRice=sc.nextDouble();
	item2.setPrice(PRice);
	System.out.println("Enter Stock");
	int StocK=sc.nextInt();
    item2.setStock(StocK);
     item1.Display();
     item2.Display();
   
Product checkPrice= new Product();
checkPrice.checkPrice(item1, item2);






	}

}
