package configstyle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BoxConfig {

	@Bean(name="user")
		public User getUser() {
			User user1=new User();
			user1.setName("rahul");
			user1.setPassword("game");
			return user1;
		}
	
	
@Bean(name="box")
public Box getBox() {
	Box box1=new Box();
	box1.setLength(10);
	box1.setWidth(10);
	return box1;
}
	
}
