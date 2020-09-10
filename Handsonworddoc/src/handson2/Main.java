package handson2;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		for(int j=0;j<=1;j++) {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Event E=new Event();
Main m=new Main();
System.out.println("Enter the name of the Event ");
String Name=br.readLine();
E.setName(Name);
System.out.println("Enter the detail of the Event ");
String Detail=br.readLine();
E.setDetail(Detail);
System.out.println("Enter the Owner Name of the Event ");
String OwnerName=br.readLine();
E.setOwnerName(OwnerName);

System.out.println("Enter the type of the event: ");
m.display();
int q=Integer.parseInt(br.readLine());
switch(q) {
case 1:
	Exhibition e=new Exhibition();
	System.out.println("Enter the no of stalls");
	int nos=Integer.parseInt(br.readLine());
	e.setNoOfStall(nos);
	double o=e.projectedRevenue();
	System.out.println("The projected revenue of the event is "+o);
	break;
	
case 2:
	StageEvent SE=new StageEvent();
	System.out.println("Enter the number of shows ");
	int ns=Integer.parseInt(br.readLine());
	SE.setNoOfShows(ns);
	System.out.println("Enter the no of seats per show ");
	int nsps=Integer.parseInt(br.readLine());
	SE.setNoOfSeatsPerShow(nsps);
	double i=SE.projectedRevenue();
	System.out.println("The projected revenue of the event is "+i);
	break;
}
		}
	
	}
	void display() {
		System.out.println("1. Exhibition");
		System.out.println("2. Stage Event");
	}

}
