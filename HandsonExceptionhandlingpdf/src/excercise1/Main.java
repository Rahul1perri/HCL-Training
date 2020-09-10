package excercise1;
import java.io.*;
public class Main {
	static int[]a=new int[10];

	public static void main(String[] args) throws NumberFormatException, IOException {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Main m=new Main();
for(int j=0;j<10;j++){ a[j]=Integer.parseInt(br.readLine());
}
 try {
m.divide();
}catch(Exception ArrayIndexOutOfBoundsException){
	System.out.println("Elements over");
}
  
	}
	void divide() {
		for(int i=0;i<100;i++) {
		
			int k=a[i]/(10-i);
			
			System.out.println("Result:"+k);
		
		} 
		
	}

}
