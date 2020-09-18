package thirdexcercise;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)  throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Hall>L=new ArrayList<>();

		System.out.println("Enter the no of Halls");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			System.out.println("The details of Hall "+i+" are");
			String S=br.readLine();
			String s[]=S.split(",",4);
			L.add(new Hall(s[0],s[1],Double.parseDouble(s[2]),s[3]));
			}	
		Collections.sort(L);
		System.out.format("%-15s %-20s %-15s %s","Name","ContactNumber","CostPerDay","OwnerName");
		Iterator<Hall>it=L.iterator();
		Hall hall=new Hall();
		while(it.hasNext()) {
			hall=it.next();
			System.out.println(hall);
		}
		
}

}
