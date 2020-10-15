package configstyle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class orderconfig {

	@Bean(name="user")
			public User getUser() {
		User user1=new User();
		user1.setName("Jagan");
		user1.setAge(24);
		user1.setCity("Chennai");
		return user1;
	}
	
	@Bean(name="orderone")
	public Order getOrder() {
		Order order1=new Order();
		order1.setItemName("OnePlusBuds");
		order1.setPrice(4999);
		return order1;
	}
	
	@Bean(name="ordertwo")
	public Order getOrder1() {
		Order order2=new Order();
		order2.setItemName("AppleAirPods");
		order2.setPrice(17999);
		return order2;
	}
	
}
