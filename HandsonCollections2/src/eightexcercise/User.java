package eightexcercise;

public class User implements Comparable<User>{
	private String name;
	private String mobile;
	private String username;
	private String password;

	public User() {
		
	}

	protected User(String name, String mobile, String username, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getMobile() {
		return mobile;
	}

	protected void setMobile(String mobile) {
		this.mobile = mobile;
	}

	protected String getUsername() {
		return username;
	}

	protected void setUsername(String username) {
		this.username = username;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		System.out.println(" ");
		System.out.format("%-15s %-15s %-15s %s\n",name,mobile,username,password );
		return " ";
	}

	public int compareTo(User o) {
		return name.compareTo(o.getName());
		}
	 
	

}



	
	

	

