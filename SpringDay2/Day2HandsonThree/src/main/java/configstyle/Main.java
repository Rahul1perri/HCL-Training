package configstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(orderconfig.class);
User user1=context.getBean("user",User.class);
user1.display();
	
	
	
	}

}
