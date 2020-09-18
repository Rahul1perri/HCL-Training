package thirdexcercise;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String> ar=new ArrayList<>();
	System.out.println("Enter the no of halls");
	int s=Integer.parseInt(br.readLine());
	for(int i=1;i<=s;i++)
	{
		System.out.println("Enter the name of hall"+i);
		String q=br.readLine();
		ar.add(q);
		}	
	System.out.println("Enter the hall to be searched");
	String C=br.readLine();
	boolean a=ar.contains(C);
	if(a) {
	System.out.println(C +" hall is found at position "+ar.indexOf(C));}
	else {System.out.println(C+" hall is not found");}
	}

}
