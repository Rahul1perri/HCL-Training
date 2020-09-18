package fourthexcecise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		UserBO Ubo=new UserBO();
		Ubo.addAll(Ubo.getList());
		System.out.println("Enter the no of user to be added");
		int u=Integer.parseInt(br.readLine());
		for(int i=1;i<=u;i++) {
			System.out.println("The details of the User"+i+ " are");
			String CV=br.readLine();
			String cv[]=CV.split(",",4);
			Ubo.add(new User(cv[0],cv[1],cv[2],cv[3]));
			}
		Iterator<User> ij=Ubo.iterator();
	    User a=new User();
	    System.out.format("%-20s%-20s%-20s%-20s","Name","ContactNumber","UserName","Email");
	     while(ij.hasNext()) {
	    	 a=ij.next();
	    	 a.display();
	     } 
	     System.out.println(" ");
		System.out.println("Enter the range of User details to be removed");
		int n11=Integer.parseInt(br.readLine());
		int n12=Integer.parseInt(br.readLine());
		Ubo.removeUser(n11,n12);
		
		Iterator<User>jk=Ubo.iterator();
		User b=new User();
		System.out.format("%-20s%-20s%-20s%-20s","Name","ContactNumber","UserName","Email");
		while(jk.hasNext()) {
			b=jk.next();
			b.display();
		} 
		    
	}

}
