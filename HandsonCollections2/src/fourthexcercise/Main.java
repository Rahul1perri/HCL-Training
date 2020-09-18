package fourthexcercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Address>L=new ArrayList<>();

		System.out.println("Enter the no of users");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			System.out.println("The details of user "+i+" are");
			String S=br.readLine();
			String s[]=S.split(",",4);
			L.add(new Address(s[0],s[1],s[2],Integer.parseInt(s[3])));
			}	
		
		Collections.sort(L);
		System.out.format("%-15s %-20s %-15s %s","Name","ContactNumber","CostPerDay","OwnerName");
		Iterator<Address>it=L.iterator();
		Address ADD=new Address();
		while(it.hasNext()) {
			ADD=it.next();
			System.out.println(ADD);
		}
		
		
		
		
	}

}
