package handsoneightexcercise;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("Enter the number of wickets");
int a=sc.nextInt();
for(int i=1;i<=a;i++) {
System.out.println("Enter the details of wicket"+i);
String wicket=sc.next();
 String [] details=wicket.split(",",5);
int b=0;
String OVER=details[b];
long Over=Long.parseLong(OVER);
b++;
String BALL=details[b];
long Ball=Long.parseLong(BALL);
b++;
String WicketType=details[b];
b++;
String PlayerName=details[b];
b++;
String BowlerName=details[b];
Wicket info=new Wicket(Over,Ball,WicketType,PlayerName,BowlerName);
info.setBall(Ball);
info.setOver(Over);
info.setWicketType(WicketType);
info.setPlayerName(PlayerName);
info.setBowlerName(BowlerName);
System.out.println("Wicket Details");
info.display();
}





	}

}
