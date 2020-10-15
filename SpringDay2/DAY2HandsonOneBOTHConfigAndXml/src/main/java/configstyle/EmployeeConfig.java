package configstyle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


public class EmployeeConfig {

	
	@Bean(name = "emp")
	public Employee getEmp() {
		Address address1=new Address();
		Employee employee1=new Employee();
		employee1.setEmployeeName("Sathish");
		employee1.setEmployeeSalary("45000");
		employee1.setEmployeeMobileNumber("9484839483");
		employee1.setEmployeeEmail("sathish@gmail.com");
		return employee1;
	}
	
     @Bean(name="address")
     public Address getAddress() {
    	 Address address1=new Address();
    	 address1.setLine1("2/115 Anna Nagar");
    	 address1.setLine2("Kaveripattinam");
    	 address1.setCity("Krishnagiri");
    	 address1.setPincode("635112");
    	 return address1;
     }

}
