package ninthexcercise;

public class User implements Comparable<User>{
	private String name;
	private String email;
	private String username;
	private String password;
	
	
	public User() {}


	protected User(String name, String email, String username, String password) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

    protected String getName() {
		return name;
	}

    protected void setName(String name) {
		this.name = name;
	}


	protected String getEmail() {
		return email;
	}


	protected void setEmail(String email) {
		this.email = email;
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


	@Override
	public String toString() {
		System.out.println("");
		System.out.format("%-15s %-15s %-15s %s\n",name,email,username,password);
		return "";
	}


	@Override
	public int compareTo(User a) {
		return name.compareTo(a.getName());
		
	}

	
	
	
}
