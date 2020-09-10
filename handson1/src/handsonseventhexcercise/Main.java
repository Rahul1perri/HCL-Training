package handsonseventhexcercise;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the over");
 long over=sc.nextLong();
 System.out.println("Enter the ball");
 long ball=sc.nextLong();
 System.out.println("Enter the runs");
 long runs=sc.nextLong();
 System.out.println("Enter the batsman name");
 String batsman=sc.next();
 System.out.println("Enter bowler name");
 String bowler=sc.next();
 System.out.println("Enter nonStriker name");
 String nonStriker=sc.next();
 
Delivery info = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
info.setOver(over);
info.setBall(ball); 
 info.setRuns(runs);
 info.setBatsman(batsman);
 info.setBowler(bowler);
 info.setNonStriker(nonStriker);
 info.displayDeliveryDetails();
 
 
 
 
 
	}

}
