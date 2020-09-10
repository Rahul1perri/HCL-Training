package handsonfourthexcercise;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
          System.out.println("Enter the player details");
          Scanner sc= new Scanner(System.in);
          String details= sc.next();
          String [] array =details.split(",",3);
          System.out.println("Player details:");
          String Name=array[0];
      	String Country=array[1];
      	String Skill=array[2];
      	Player info = new Player(Name,Country,Skill);
      	info.Display();
      	
          
}

}
