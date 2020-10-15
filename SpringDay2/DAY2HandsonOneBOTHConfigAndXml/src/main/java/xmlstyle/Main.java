package xmlstyle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) throws IOException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Details of the Employee");
		System.out.println("Enter the name of the employee");
		String NAME=br.readLine();
		System.out.println("Enter the mobile number");
		String NUMBER=br.readLine();
		System.out.println("Enter the salary");
		String SALARY=br.readLine();
		System.out.println("Enter the emailID");
		String EMAIL=br.readLine();
		System.out.println("Enter the Address Line 1");
		String LINE1=br.readLine();
		System.out.println("Enter the Address Line 2");
		String LINE2=br.readLine();
		System.out.println("Enter the City");
		String CITY=br.readLine();
		System.out.println("Enter the Pincode");
		String PINCODE=br.readLine();
		
		Employee employee1=context.getBean("employee",Employee.class);
		Address address1=new Address();
		employee1.setEmployeeName(NAME);employee1.setEmployeeMobileNumber(NUMBER);
		employee1.setEmployeeSalary(SALARY);employee1.setEmployeeEmail(EMAIL);
		address1.setLine1(LINE1);address1.setLine2(LINE2);address1.setCity(CITY);
		address1.setPincode(PINCODE);employee1.setAddress(address1);
		employee1.display();
		
	}

}
