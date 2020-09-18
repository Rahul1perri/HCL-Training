package sixthexcercise;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> SET=new HashSet<>();
		System.out.println("Enter the username");
		String S=br.readLine();
		SET.add(S);
	while(true) {	
		System.out.println("Do you want to continue? (Y/N)");
		String res=br.readLine();
	if(res.equals("Y")) {
		System.out.println("Enter the username");
		String J=br.readLine();
		SET.add(J);
	}else {
		break;
	}}
	int size=SET.size();
	System.out.println("There are "+size+" no of unique usernames");
		System.out.println(SET);
		// Insert null values in username and see the effect urselves
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
