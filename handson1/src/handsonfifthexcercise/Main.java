package handsonfifthexcercise;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		Venue info =new Venue();
		Scanner sc= new Scanner(System.in);
System.out.println("Enter venue name");
String Name=sc.next();
info.setName(Name);
System.out.println("Enter city name");
String City=sc.next();
info.setCity(City);
System.out.println("Venue Details");
System.out.println("Venue Name:"+ " "+ info.getName());
System.out.println("City Name:"+ " "+ info.getCity());	
while(true) {
info.Menu();
int n=sc.nextInt();
switch(n)
{
case 1:
	System.out.println("Enter Venue name");
	String NAME=sc.next();
	info.setName(NAME);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 2:
	System.out.println("Enter City name");
	String CITY=sc.next();
	info.setCity(CITY);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 3:
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
    break;	
	}
int j=sc.nextInt();
switch(j)
{
case 1:
	System.out.println("Enter Venue name");
	String NAME=sc.next();
	info.setName(NAME);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 2:
	System.out.println("Enter City name");
	String CITY=sc.next();
	info.setCity(CITY);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 3:
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
    break;	
	}
int k=sc.nextInt();
switch(k)
{
case 1:
	System.out.println("Enter Venue name");
	String NAME=sc.next();
	info.setName(NAME);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 2:
	System.out.println("Enter City name");
	String CITY=sc.next();
	info.setCity(CITY);
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
	info.Menu();
	break;
case 3:
	System.out.println("Venue Details");
	System.out.println("Venue Name:"+ " "+ info.getName());
	System.out.println("City Name:"+ " "+ info.getCity());
    break;	
	}
	}}

}
