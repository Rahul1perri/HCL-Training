package punefort;
import java.io.*;
import java.util.Scanner;
public class Main {

	
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Rajmachi"+"\n"+"2. Shivgadh"+"\n"+"3. Murud");
		System.out.println("Choose a destination");
String s=sc.next();
if(s.equals("1")) {
	Fort F=new Rajmachi();
	F.distance();}
else if(s.equals("2")) {
	Fort F=new Shivgadh();
	F.distance();
}else {
	Fort F=new Murud();
	F.distance();
}


	}

}
