package configstyle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {

	@Bean(name="course1")
	public Course getCourse1() {
		Course course1=new Course();
		course1.setName("JAVA Core");
		course1.setMentor("Siddharth");
		course1.setFee(3000);
		return course1;
	}
	@Bean(name="course2")
	public Course getCourse2() {
		Course course2=new Course();
		course2.setName("Python");
		course2.setMentor("Hridarth");
		course2.setFee(4000);
		return course2;
	}
	@Bean(name="course3")
	public Course getCourse3() {
		Course course3=new Course();
		course3.setName("Servlets");
		course3.setMentor("Krunal");
		course3.setFee(3500);
		return course3;
	}
	
}
