package firstexcercise;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

List<TicketBooking> L=new ArrayList<>();
System.out.println("Enter the number of customers");
int N=Integer.parseInt(br.readLine());
for(int i=1;i<=N;i++) {
	System.out.println("Details of customer"+i+" are");
	String I=br.readLine();
	String Q[]=I.split(",",2);
	L.add(new TicketBooking(Q[0],Integer.parseInt(Q[1])));
	}

Comparator C=new TicketBooking();
TicketBooking t1=Collections.min(L,C);
System.out.println(t1.getCustomerName()+" spends minimum amount of"+" "+t1.getPrice()+" Rupees");
TicketBooking t2=Collections.max(L,C);
System.out.println(t2.getCustomerName()+" spends minimum amount of"+" "+t2.getPrice()+" Rupees");




	}

}
