package configstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee1=context.getBean("emp",Employee.class);
		employee1.display();
		
		
		
		
	}

}
