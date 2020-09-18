package fifthexcercise;

public class User {
private String name;
private String email;
private String username;
private String password;

public User() {
	
}

protected User(String name, String email, String username, String password) {
	super();
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

public String toString() {
	System.out.println(" ");
	System.out.format("%-15s %-15s %-15s %s\n",name,email,username,password );
	return " ";
}










}
