package eightexcercise;
import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User>L=new ArrayList<>();
		HashMap<String,String>H=new HashMap<String,String>();
		System.out.println("Enter the no of users");
		int a=Integer.parseInt(br.readLine());
		for(int i=1;i<=a;i++) {
		System.out.println("Enter the details of user "+i);
		String s=br.readLine();
		String S[]=s.split(",",4);
		L.add(new User(S[0],S[1],S[2],S[3]));
		}
		
		Collections.sort(L);
		Collections.reverse(L);
		
		System.out.format("%-15s %-15s","Name","Mobile");
		
		for(int e=0;e<a;e++) {
			H.put(L.get(e).getName(), L.get(e).getMobile());
		}
		
		Set f=H.entrySet();
		Iterator<HashMap>u=f.iterator();
		while(u.hasNext()) {
			Map.Entry K=(Map.Entry)u.next();
			System.out.format("%-15s %-15s",K.getKey(),K.getValue());
			System.out.println(" ");
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	


