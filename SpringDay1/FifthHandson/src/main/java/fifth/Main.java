package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Name");
String NAME=br.readLine();
System.out.println("Enter the Password");
String PASSWORD=br.readLine();
System.out.println("Enter the Mobile Number");
String MOBILENUMBER=br.readLine();

Owner owner1=(Owner) context.getBean("rahul");
owner1.setDetails(NAME, PASSWORD, MOBILENUMBER);
owner1.display();



((AbstractApplicationContext) context).close();






	}

}
