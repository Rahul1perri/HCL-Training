package sixthexcercise;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("For how many days u need to track tickets availabla?");
		int n=Integer.parseInt(br.readLine());
        List<Integer>showList=new ArrayList<>();
        ArrayList<List<Integer>>dayList=new ArrayList<>();
       for(int j=1;j<=5;j++) { 
    	   System.out.println("Day"+j);
        String s=br.readLine();
        String S[]=s.split(",",4);
        for(int i=0;i<4;i++ ) {
        	showList.add(100-Integer.parseInt(S[i]));
        	
        }}
       
        int b=0;
    for (int u=0;u<5;u++) {
    	dayList.add(showList.subList(b,b+4));
        b=b+4;
       }
        
      while(true) {
    	  System.out.println("Enter the day for which ticket status is required");
    	  int d=Integer.parseInt(br.readLine());
    	  System.out.println("The status is "+dayList.get(d-1));
    	  
    	  System.out.println("Do you wish to look for another day? (Y/N)");
    	  String J=br.readLine();
    	  if(J.equals("N")) {
    		  break;
    	  }
      }
     
       
    	   
    	   
       

	
	
	
	
	
}}


