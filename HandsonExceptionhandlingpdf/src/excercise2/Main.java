package excercise2;
import java.io.*;


public class Main {
	static int []a=new int[10]; 
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			Main m=new Main();
			for(int i=0;i<10;i++){ a[i]=Integer.parseInt(br.readLine());}
			System.out.println("Enter the divisor");
			n=Integer.parseInt(br.readLine());
			try {
			 m.divide();
		
			}catch(Exception ArithmeticException){
				System.out.println("Cant divide by 0");
			}
	}
	void divide() {
		int i=0;
		while(true) {
			int k=a[i]/n;
			System.out.println("Result: "+k);
			i++;
		}
	}

}
