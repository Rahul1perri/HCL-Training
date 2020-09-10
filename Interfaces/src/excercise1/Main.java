package excercise1;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
Main m=new Main();

m.menu();
String s=br.readLine();
switch(Integer.parseInt(s)) {
case 1:
GoldStall gs=new GoldStall();
System.out.println("Enter the Details");
String a=br.readLine();
String q[]=a.split(",",4);
gs.setStallName(q[0]);
gs.setCost(Integer.parseInt(q[1]));
gs.setOwnerName(q[2]);
gs.setTvSet(Integer.parseInt(q[3]));
gs.display();
break;
case 2:
	PremiumStall ps=new PremiumStall();
	System.out.println("Enter the Details");
	String A=br.readLine();
	String Q[]=A.split(",",4);
	ps.setStallName(Q[0]);
	ps.setCost(Integer.parseInt(Q[1]));
	ps.setOwnerName(Q[2]);
	ps.setProjector(Integer.parseInt(Q[3]));
	ps.display();
	break;
case 3:
	ExecutiveStall es=new ExecutiveStall();
	System.out.println("Enter the Details");
	String B=br.readLine();
	String U[]=B.split(",",4);
	es.setStallName(U[0]);
	es.setCost(Integer.parseInt(U[1]));
	es.setOwnerName(U[2]);
	es.setScreen(Integer.parseInt(U[3]));
	es.display();
	break;
}
}
}
	void menu() {
		System.out.println("1. GoldStall");
		System.out.println("2. PremiumStall");
		System.out.println("3. ExecutiveStall");
	}

}
