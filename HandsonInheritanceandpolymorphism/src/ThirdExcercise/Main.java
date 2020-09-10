package ThirdExcercise;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
Stall St= new Stall();
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the name of stall:");
	String name=br.readLine();
	St.setName(name);
	System.out.println("Enter the detail of stall:");
	String detail=br.readLine();
	St.setDetail(detail);
	System.out.println("Enter the owner name of the stall:");
	String owner=br.readLine();
	St.setOwnerName(owner);
	System.out.println("Enter the Type of Stall");
	String Stall=br.readLine();
	System.out.println("Enter the size of the stall in square feet");
	int SF=Integer.parseInt(br.readLine());
	System.out.println("Does the hall have TV?");
	String k=br.readLine();

	if (k.contentEquals("y")) {
		System.out.println("Enter the No of TV");
		int no=Integer.parseInt(br.readLine());
	double j=	St.computeCost(Stall, SF, no);
		St.display();
		System.out.println(j);
	}else {
	double j=	St.ComputeCost(Stall, SF);
	St.display();
		System.out.println(j);
	}
		
		
		
		
		
		
	}

}
