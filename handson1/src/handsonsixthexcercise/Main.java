package handsonsixthexcercise;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		ExtraType info = new ExtraType();
System.out.println("Enter the Extratype details");
Scanner sc=new Scanner(System.in);
String a=sc.next();
String [] details = a.split("#",2);
System.out.println("Extratype Details:");
String name=details[0];
String runs=details[1];
info.setName(name);
long RUNS=Long.parseLong(runs);
info.setRuns(RUNS);
System.out.println("Extra Type Name:"+ name);
System.out.println("Runs:"+runs);
	
	}

}
