package carservice;
import java.util.*;
public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Service s=new Service();
s.sum();
int num=sc.nextInt();

s.years();
int y=sc.nextInt();

s.brand();
String b=sc.next();
int sum=0;

while(num>0) {
	 int digit = num % 10;
     num /= 10;
     sum += digit;
}
if (sum % 2 ==0){
    System.out.println("You can come on Tuesday, Thursday and  Saturday");
}
else{
    System.out.println("You can come on Monday, Wednesday and Friday");
}	
	
if(y>5) {
	System.out.println("Your car is eligible for free car wash");
}else {
	System.out.println("Your car is not eligible for free car wash");
}
	if(b.equals("Maruti")) {
		double serviceCharge =5000-0.05*5000;
		System.out.println("Your servicing charges are  "+serviceCharge);
	}	else {
		double serviceCharge=5000;
		System.out.println("Your servicing charges are  "+serviceCharge);
	}
		
	}

}
