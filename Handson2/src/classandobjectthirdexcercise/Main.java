package classandobjectthirdexcercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
public static int n=5;
	public static void main(String[] args)  throws NumberFormatException, IOException, NullPointerException {
Product []goods=new Product[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no of products");


for(int j=0;j<n;j++) {
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
goods[j].setStaticname("L&KSuppliers");
}

for(int j=0;j<n;j++) {
	goods[j].display(goods);
	goods[j].getDiscountedPrice1(goods);
	
}

Product p=new Product();

p.checkPrice(goods);
p.minStock(goods);

	}
	
	
	
	

}
