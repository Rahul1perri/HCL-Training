package configstyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CourseConfig.class);
          Course course1=context.getBean("course1",Course.class);
          Course course2=context.getBean("course2",Course.class);
          Course course3=context.getBean("course3",Course.class);
          course1.display();
          course2.display();
          course3.display();
	}

}
