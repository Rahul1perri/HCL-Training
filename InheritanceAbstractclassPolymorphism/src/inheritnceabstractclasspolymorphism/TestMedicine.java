package inheritnceabstractclasspolymorphism;

import java.util.*;
import java.io.*;

public class TestMedicine {
static String q,w[];
static int z=5;
	public static void main(String[] args) throws IOException,NumberFormatException{
	
		Medicine T=new Tablets();
		Medicine S=new Syrup();
		Medicine O=new Ointment();
		int R;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

for (int i=0;i<z;i++) {
	System.out.println("Enter the Medicine type");
	 R=new Random().nextInt(3);
	 switch(R){
	 case 0:
		 break;
	 case 1:
		 System.out.println("Enter the tablet details:");
			q=br.readLine(); 
			break;
	 case 2:
		 System.out.println("Enter the syrup details:");
			q=br.readLine();
			break;
	 case 3:
		 System.out.println("Enter the ointment details:");
			q=br.readLine();
	 }
	 String w[]=q.split(",",3);
		String NAME=w[0];
		double PRICE=Double.parseDouble(w[1]);
		String EXPIRY=w[2];
		switch(R) {
		case 1:
			T.Name=NAME;
			T.Price=PRICE;
			T.ExpiryDate=EXPIRY;
			T.getDetails();
			System.out.println("Name: "+T.getName());
			System.out.println("Pice: "+T.getPrice());
			System.out.println("Expiry Date: "+T.getExpiryDate());
			T.displayLabel();
			break;
		case 2:
			S.Name=NAME;
			S.Price=PRICE;
			S.ExpiryDate=EXPIRY;
			S.getDetails();
			System.out.println("Name: "+S.getName());
			System.out.println("Pice: "+S.getPrice());
			System.out.println("Expiry Date: "+S.getExpiryDate());
			S.displayLabel();
			break;
		case 3:
			O.Name=NAME;
		    O.Price=PRICE;
		    O.ExpiryDate=EXPIRY;
	        O.getDetails();
	        System.out.println("Name: "+O.getName());
			System.out.println("Pice: "+O.getPrice());
			System.out.println("Expiry Date: "+O.getExpiryDate());
			O.displayLabel();
			break;
			}
		
		
		
	
	}

	
	
	

	}
	
}


