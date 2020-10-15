package configstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BoxConfig.class);
		
		Box box1=context.getBean("box",Box.class);
		box1.display();

	}

}
