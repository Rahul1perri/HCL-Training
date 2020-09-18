package secondexcercise;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
List<Stall>L=new ArrayList<>();

System.out.println("Enter the no of Stalls to be entered");
int n=Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++) {
	System.out.println("The details of Stall "+i);
	String S=br.readLine();
	String s[]=S.split(",",4);
	L.add(new Stall(s[0],s[1],s[2],s[3]));
	}


System.out.format("%-15s %-20s %-15s %s", "Name","Detail","Tye","Owner");
Iterator<Stall>it=L.iterator();
Stall stall=new Stall();
while(it.hasNext()) {
	stall=it.next();
	if(stall.getName().startsWith("test"))
		{it.remove();
		}else
	{stall.display();}
}






	}

}
