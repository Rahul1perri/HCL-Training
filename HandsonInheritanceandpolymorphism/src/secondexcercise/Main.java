package secondexcercise;
import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Account Details");
		String detail=br.readLine();
		AccountBO ab =new AccountBO();
		FixedAccount F=ab.getAccountDetail(detail);
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n",F.getAccountNumber(),F.getBalance(),F.getAccountHolderName(),F.getMinimumBalance(),F.getLockingPeriod());
		
		
		
	}

}
