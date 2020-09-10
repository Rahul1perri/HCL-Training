package classandobjectsecondexcercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
	static String[]Total=new String[100];
	String []disc=new String[100];
	static int j=0;
	double b;
	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the product code");
		int Productcode=Integer.parseInt(br.readLine());
		System.out.println("Enter the product name");
		String Productname=br.readLine();
		System.out.println("Enter the price");
		int PRICE=Integer.parseInt(br.readLine());
		double Price=(double)PRICE;
		System.out.println("Enter the Stock");
		int Stock=Integer.parseInt(br.readLine());
		Product goods1=new Product();
		goods1.setProduct_code(Productcode);
		goods1.setProduct_name(Productname);
		goods1.setPrice(Price);
		goods1.setStock(Stock);
		goods1.setStaticname("L & K Suppliers");
		
		System.out.println("Enter the product code");
		int PRoductcode=Integer.parseInt(br.readLine());
		System.out.println("Enter the product name");
		String PRoductname=br.readLine();
		System.out.println("Enter the price");
		int PrICE=Integer.parseInt(br.readLine());
		double PRice=(double)PrICE;
		System.out.println("Enter the Stock");
		int STock=Integer.parseInt(br.readLine());
		Product goods2=new Product();
		goods2.setProduct_code(PRoductcode);
		goods2.setProduct_name(PRoductname);
		goods2.setPrice(PRice);
		goods2.setStock(STock);
		goods2.setStaticname("L & K Suppliers");
		goods1.Display();
		goods1.getDiscountedPrice1(goods1);
		goods2.Display();
		goods2.getDiscountedPrice1(goods2);
		Product check=new Product();
		check.checkPrice(goods1, goods2);
		}}
