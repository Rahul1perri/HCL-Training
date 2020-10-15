package configstyle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ownerconfig {

	
	@Bean(name="owner")
	public Owner setDetails() {
		Owner owner=new Owner();
		owner.setDetails("Rahul","Game","9443070438");
		return owner;
	}
	
	
	
	
}
