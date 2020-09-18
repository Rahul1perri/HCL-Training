package frstexcercise;
import java.util.*;

public class Main {
	
	
	

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
ArrayList a=new ArrayList();
int i=1;
System.out.println("Enter the name of user"+i);
String S=sc.next();
a.add(S);
while(true) {
System.out.println("Do you want to continue? (Y/N)");
String P=sc.next();
if(P.equals("Y")) {
	i++;
	System.out.println("Enter the name of user"+i);
	String Q=sc.next();
	a.add(Q);
}else {
	break;
}}
Iterator<String>a1=a.iterator();
System.out.println("The entered names are");
while(a1.hasNext()) {
	System.out.println(a1.next());
}
	}

}
