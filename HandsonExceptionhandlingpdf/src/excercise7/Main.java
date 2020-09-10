package excercise7;
import java.io.*;
public class Main {

	public static void main(String[] args) throws  IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The Details of the Type are");
		try {
		System.out.println("Name");
		String Name=br.readLine();
		System.out.println("Deposit");
		double Deposit=Double.parseDouble(br.readLine());
		double Costperday=Double.parseDouble(br.readLine());
		ItemType it=new ItemType(Name,Deposit,Costperday);
	 String D=it.toString();
		}
		catch(NumberFormatException nfe) {
			System.out.println("Exception occued please change input type");
		}
		
		
		
		
		
		
		
		
	}

}
