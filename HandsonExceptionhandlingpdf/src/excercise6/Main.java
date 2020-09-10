package excercise6;
import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the cost for n days");
		int c=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of n");
		int n=Integer.parseInt(br.readLine());
		try {
			int k=c/n;
			System.out.println("Cost of the item per day is "+k);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
	}

}
