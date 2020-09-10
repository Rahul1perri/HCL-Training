package Classandobjectfourthexcercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args)  throws NumberFormatException, IOException, NullPointerException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			int a,w;
		Product M=new Product();
		System.out.println("Enter the No of Products");
		 a=Integer.parseInt(br.readLine());
		M.Menu();
	    System.out.println("Enter your Choice");
		 w=Integer.parseInt(br.readLine());
		Product []goods=new Product[100];
		do {
		switch(w) {
		case 1: 
			System.out.println("Enter Product Details:");
			
			for(int j=0;j<a;j++) {
			goods[j]=new Product();
			System.out.println("Enter the Product Code");
			int Productcode=Integer.parseInt(br.readLine());
			System.out.println("Enter the Product name");
			String Productname=br.readLine();
			System.out.println("Enter the Price");
			int PRICE=Integer.parseInt(br.readLine());
			double Price=(double)PRICE;
			System.out.println("Enter the Stock");
			int Stock=Integer.parseInt(br.readLine());
			goods[j].setProduct_code(Productcode);
			goods[j].setProduct_name(Productname);
			goods[j].setPrice(Price);
			goods[j].setStock(Stock);
			goods[j].setStaticname("L&KSuppliers");}
			M.Menu();
			 w=Integer.parseInt(br.readLine());
			break;
		case 2:
                for(int j=0;j<a;j++) {
                	System.out.println("The Products are:");
				goods[j].display(goods);}
                M.Menu();
                 w=Integer.parseInt(br.readLine());
		break;
		case 3:
			for(int j=0;j<a;j++) {
				System.out.println("The Discount prices are");
				goods[j].getDiscountedPrice1(goods);}
			M.Menu();
            w=Integer.parseInt(br.readLine());
			break;
		case 4:
			M.Menu();
            w=Integer.parseInt(br.readLine());
			break;
		case 5:
			M.Menu();
            w=Integer.parseInt(br.readLine());
			break;
		case 6:
			break;
		}
		} while(true);
		
	}
	}
