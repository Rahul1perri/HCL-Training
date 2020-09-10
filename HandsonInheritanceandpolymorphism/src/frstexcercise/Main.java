package frstexcercise;
import java.util.*;
import java.io.*;
public class Main {
int a;
String s[],d[];
	public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Choose Account Type");
	while(true) {
		Main M=new Main();
		M.menu();
		SavingsAccount sa=new SavingsAccount();
		CurrentAccount ca=new CurrentAccount();
		int a=Integer.parseInt(br.readLine());
		switch(a) {
		case 1:
			System.out.println("Enter the Account Details");
			String b=br.readLine();
			String s[]=b.split(",",4);
		    String AccountName=s[0];
			sa.setAccName(AccountName);
			String AccountNumber=s[1];
			sa.setAccNo(AccountNumber);
			String BankName=s[2];
			sa.setBankName(BankName);
			String OrgName=s[3];
			sa.setOrgName(OrgName);
			sa.display();
			break;
			
			case 2:
				System.out.println("Enter the Account Details");
				String c=br.readLine();
				String d[]=c.split(",",4);
				String ACcountName=d[0];
				ca.setAccName(ACcountName);
				String ACcountNumber=d[1];
				ca.setAccNo(ACcountNumber);
				String BAnkName=d[2];
				ca.setBankName(BAnkName);
				String TinNumber=d[3];
				ca.setTinNumber(TinNumber);
				ca.display();
				break;
		}
		}
		}
	void menu() {
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
	}

}
