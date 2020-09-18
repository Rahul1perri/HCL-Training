package seventhexcercise;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException,ClassCastException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Address>L=new ArrayList<>();
		HashMap<String,List<Address>>H=new HashMap<String,List<Address>>();
		HashMap<String,Map<String,List<Address>>>h=new HashMap<String,Map<String,List<Address>>>();
		System.out.println("Enter the no of addresses to be entered");
		int a=Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++) {
			System.out.println("Address "+i);
			String s=br.readLine();
			String[]S=s.split(",",5);
			L.add(new Address(S[0],S[1],S[2],S[3],Integer.parseInt(S[4])));
			h.put(S[3],H);
			H.put(S[2],L);
		}
		
		System.out.println("Enter the state to be searched");
		String d=br.readLine();
		if(h.containsKey(d)) {
			System.out.println("Enter the city to be seached");
			String D=br.readLine();
             if(H.containsKey(D)) {
            	 System.out.format("%-15s %-15s %-15s %-15s %s\n","addressLine1","addressLine2","city","state","pincode"); 
                 Iterator<Address>adrs=H.get(D).iterator();
                 while(adrs.hasNext()) {
                	 Address A=new Address();
                	 A= adrs.next();
                	 if(A.getCity().equals(D)) {
                	 System.out.println(A);}
                 }
             }
			
		}
	
		
		
		
		
	
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}
}
