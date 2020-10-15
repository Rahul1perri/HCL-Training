package configstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ownerconfig.class);
Owner owner1=context.getBean("owner",Owner.class);
		owner1.display();
		
		
		
	}

}
