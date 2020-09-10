package handsonsecondexcercise;
import java.util.*;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the player Name");
		String name=sc.nextLine();
		System.out.println("enter the country name");
		String country=sc.nextLine();
		System.out.println("enter the skill ");
		String skill=sc.nextLine();
		
		System.out.println("Player details:");
		System.out.println("Player Name:"+" "+ name);
		System.out.println("Country Name:"+" "+ country);
		System.out.println("Skill:"+" "+ skill);

	}

}
