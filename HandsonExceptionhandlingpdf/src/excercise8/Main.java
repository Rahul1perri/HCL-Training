package excercise8;
import java.util.*;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer input");
		
		try {
			int k=sc.nextInt();
			System.out.println("The entered value is "+k);
		}catch(InputMismatchException ime) {
			System.out.println("The input given is not of the integer type");
		}
	}

}
