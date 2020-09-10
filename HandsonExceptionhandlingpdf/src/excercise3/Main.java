package excercise3;
import java.io.*;


public class Main {
	static int []a=new int[10]; 
	static int n,k;
	
	class IllegalArgumentException extends RuntimeException{
		IllegalArgumentException(String description){
			super(description);
		} 
			
		}
	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Main m=new Main();
		for(int i=0;i<10;i++){ a[i]=Integer.parseInt(br.readLine());}
		System.out.println("Enter the divisor");
		n=Integer.parseInt(br.readLine());

		 m.divide();
	
		
			
}
	
	void divide() {
		for(int y=0;y<10;y++) {
			try {
			if ((a[y]%2!=0 && n%2==0)||(a[y]%2==0 && n%2!=0)) {
				throw new IllegalArgumentException("Combo");
				}
			
				 k=a[y]/n;
				System.out.println("Result: "+k);}
			catch(IllegalArgumentException ia){
				System.out.println("Exception handled ");
				 k=a[y]/n;
				System.out.println("Result: "+k);}
			}
				
			
		}
		
	}



