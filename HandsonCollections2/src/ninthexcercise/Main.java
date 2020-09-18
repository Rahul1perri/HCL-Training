package ninthexcercise;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         List<User>L=new ArrayList<>();
         Comparator C=new EmailComparator();
	System.out.println("Enter the no of users");
		int q=Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++) {
			System.out.println("Enter the details");
			String I=br.readLine();
			String h[]=I.split(",",4);
			L.add(new User(h[0],h[1],h[2],h[3]));
			}
		
		System.out.println("Enter by which mode you want to search");
		System.out.println("1. Name"+"\n"+"2.Email");
		int b=Integer.parseInt(br.readLine());
		switch(b) {
		case 1:
		System.out.println("Enter the name");
		String M=br.readLine();
		int v=Collections.binarySearch(L, new User(M,null,null,null),null);
		if(v<0) {
			System.out.println("Invalid Name");
		}else {
			System.out.format("%-15s %-15s %-15s %s\n","name","email","username","password");
			User T=L.get(v);
			System.out.println(T);
			}
		break;
		case 2:
			System.out.println("Enter the name");
			String m=br.readLine();
			int Y=Collections.binarySearch(L, new User(null,m,null,null),C);
			if(Y<0) {
				System.out.println("Invalid Email");
			}else {
				System.out.format("%-15s %-15s %-15s %s\n","name","email","username","password");
				User T=L.get(Y);
				System.out.println(T);
				}
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
