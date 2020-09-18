package seventhexcercise;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<CallLog> al=new ArrayList<>();
try {
	BufferedReader br=new BufferedReader(new FileReader("F:\\HCL\\eclipse\\HandsonCollections1\\src\\seventhexcercise\\calllog.csv"));
    String read;
	while((read=br.readLine())!=null) {
		String INPUT[]=read.split(",",4);
		al.add(new CallLog(INPUT[0],INPUT[1],Integer.parseInt(INPUT[2]),INPUT[3]));
	}
	
	Comparator C12=new CallLog();
	Collections.sort(al,C12);
     
	Iterator<CallLog>IT=al.iterator();
	CallLog C=new CallLog();
	System.out.format("%-15s%-25s%-15s%-15s","Name","Dialled Number","Duration","Date");
	while(IT.hasNext()) {
		C=IT.next();
	
		System.out.println();
		System.out.println(C);
	}



} catch (FileNotFoundException e) {
System.out.println("File not Found");}

	}

}
