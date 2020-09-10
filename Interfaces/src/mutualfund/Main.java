package mutualfund;
import java.util.*;

public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("1. AxisBank"+"\n"+"2. HDFC"+"\n"+"3. ICICI");
System.out.println("Choose the bank");
int a=Integer.parseInt(sc.next());
switch(a) {
case 1:
	AxisBank ab=new AxisBank();
	ab.duration();
	double d=sc.nextInt();
	ab.amount();
	double am=sc.nextInt();
	double total=(d*am*56)/100;
	System.out.println("You will have returns as-"+" "+total+" in"+" "+d+" years");
	break;
case 2:
	HDFC hc=new HDFC();
	hc.duration();
	double e=sc.nextInt();
	hc.amount();
	double r=sc.nextInt();
	double Total=(e*r*49)/100;
	System.out.println("You will have returns as-"+" "+Total+" "+"in"+" "+e+" years");
	break;
case 3:
	ICICI ii =new ICICI();
	ii.duration();
	double w=sc.nextInt();
	ii.amount();
	double t=sc.nextInt();
	double TOtal=(w*t*60)/100;
	System.out.println("You will have returns as-"+" "+TOtal+" "+"in"+" "+w+" years");
	break;
}

	}

}
