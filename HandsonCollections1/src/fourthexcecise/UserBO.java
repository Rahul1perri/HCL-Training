package fourthexcecise;

import java.util.ArrayList;

public class UserBO extends ArrayList<User>{

	 static UserBO ubo=new UserBO();
	
	public void removeUser(int n1, int n2) {
		removeRange(n1, n2);
		
	}
	
	static UserBO getList() {
		ubo.add(new User("mohan Raja","9874563210"," mohan"," mohan@abc.in"));
		ubo.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		ubo.add(new User("prakash Raj","7548921445","prakash","raj@abc.in"));
		return ubo;
	}
	
	
	
}
