package excercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	static int []a=new int[10]; 
	static int n,k;
	
	class IllegalArgumentException extends RuntimeException{
		IllegalArgumentException(String description){
			super(description);
		} 
			
		}
	public static void main(String[] args) throws NumberFormatException, IOException, IllegalArgumentException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Main m=new Main();
		for(int i=0;i<10;i++){ a[i]=Integer.parseInt(br.readLine());}
		System.out.println("Enter the divisor");
		n=Integer.parseInt(br.readLine());
        try { m.divide();}
		catch(IllegalArgumentException ie) {
			System.out.println("Exception handled in main");
			}
	}
	
	void divide() throws IllegalArgumentException {
		for(int y=0;y<10;y++) {
			if ((a[y]%2!=0 && n%2==0)||(a[y]%2==0 && n%2!=0)) {
				 throw new IllegalArgumentException("Combo");}
				k=a[y]/n;
				System.out.println("Result: "+k);}
		}

}
