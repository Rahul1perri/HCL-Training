package excercise5;
import java.io.*;



public class Main {
	static int []a=new int[10]; 
	static int n,k;
	static class WrongComboException extends Exception{
		WrongComboException(String description){
			super(description);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Main m=new Main();
		System.out.println("enter the numbers");
		for(int i=0;i<10;i++){ a[i]=Integer.parseInt(br.readLine());}
		System.out.println("Enter the divisor");
		n=Integer.parseInt(br.readLine());
	for(k=0;k<10;k++) {
		if(a[k]%2==0) {
			System.out.println("The valid combo are "+a[k]+" and "+n);
		}else {
			try {
				throw new WrongComboException("Not valid Combo");}
			catch(WrongComboException we) {
				System.out.println("Both "+a[k]+" and "+n+" are invalid");
			}
			}
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


