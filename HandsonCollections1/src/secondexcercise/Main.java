package secondexcercise;
import java.util.*;
import java.io.*;
public class Main {
static	ItemType it=new ItemType();
static	ArrayList<ItemType>ar=new ArrayList();
static	int i=1;
	public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Main m=new Main();
m.initialize();
while(true) {
	System.out.println("Do you want to continue? (Y/N)");
	String d=br.readLine();
	if(d.equals("Y")) {
		i++;
		m.initialize();
	}else 
		break;
}
Iterator<ItemType>a2=ar.iterator();
System.out.format("%-20s%-20s%-20s","Name","Deposit","Cost Per Day");
while(a2.hasNext()) {
	ItemType IT= a2.next();
	System.out.println(IT);
}

}
	public	void  initialize() throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Details of Item Type"+i);
	System.out.println("Enter name");
	String Name=br.readLine();
	System.out.println("Enter deposit");
	double Deposit=Double.parseDouble(br.readLine());
	System.out.println("Enter cost per day");
	double CostPerDay=Double.parseDouble(br.readLine());
	ar.add(new ItemType(Name,Deposit,CostPerDay));
}

}
