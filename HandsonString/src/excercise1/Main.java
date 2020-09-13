package excercise1;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
CheckStrings cs=new CheckStrings();
		//1
		System.out.println("Enter Humpty's Sentence :");
		String h=br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
	    String d=br.readLine();
	    String s=cs.concatString(h, d);
	    System.out.println("The concantanated String is : "+s);
	    
	    //2
	    System.out.println("Enter Humpty's Sentence :");
		String H=br.readLine();
		System.out.println("Enter Dumpty's Sentence :");
	    String D=br.readLine();
	    boolean S=cs.stringFound(H, D);
	    if(S==true){System.out.println("Found");}
	    else {System.out.println("not found");}
	    
	    //3
	    System.out.println("Enter Humpty's Sentence :");
	  		String Q=br.readLine();
	  		System.out.println("Dumpty says");
	  	    String z=cs.stringReverse(Q);
		System.out.println(z);
		
		//4
		  System.out.println("Enter Humpty's Sentence :");
			String q=br.readLine();
			System.out.println("Word to replace");
		    String W=br.readLine();
		    System.out.println("Synonym to be replaced");
		    String w=br.readLine();
		   String Z= cs.replaceString(q, W, w);
		System.out.println(Z);
	
		
	//5
		System.out.println("Enter Humpty's Sentence");
		String Y=br.readLine();
		System.out.println("Enter the second voice sentence");
		String y=br.readLine();
		boolean J=cs.locationEqual(Y,y);
		if(J==true) {
			System.out.println("Its his echo");
		}else {
			System.out.println("Its dumpty repeaitng");
		}
		
		
	//6
		System.out.println("say something");
		String A=br.readLine();
		System.out.println("Dumpty says: "+A);
		System.out.println("What does humpty want to remove?");
		String P=br.readLine();
		String p=cs.editString(A, P);
		System.out.println("Dumpty's new sentence is: "+p);
		
		//7
		System.out.println("Enter Humpty's Sentence");
		String O=br.readLine();
		System.out.println("Humpty says: "+O);
		System.out.println("What dumpty wants to inset and where?");
		String o=br.readLine();
		System.out.println("Enter the position");
		int Pos=Integer.parseInt(br.readLine());
		String I=cs.insertData(O, o, Pos);
		System.out.println("Humpty's new sentecne: "+I);  
		
		//8
		System.out.println("Enter Humpty's sentence");
		String V=br.readLine();
		System.out.println("Enter Dumpty's sentence ");
		String v=br.readLine();
		int T=cs.checkCount(V, v);
		switch(T) {
		case 0:
			System.out.println("Equal no of words");
			break;
		case 1:
			System.out.println("Humpty's sentence has more words");
			break;
		case 2:
			System.out.println("Dumpty's sentence has more words");
			break;
		}
		
		//9
		System.out.println("Enter Humpty's sentence");
		String U=br.readLine();
		String u=cs.convertString(U);
		System.out.println("converted String is: "+u);
		
		//10
		System.out.println("Enter Humpty's sentence");
		String G=br.readLine();
		boolean g=cs.checkUpperCase(G);
		if(g==true) {
			System.out.println("Everything is in capitals");
		} else {
			System.out.println("Everything is not in capitals");
		} 
		
		
		
	}

}
