package xmlstyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Box {
private User user;
private int length;
private int width;

public Box() {
	
}

public Box(User user, int length, int width) {
	super();
	this.user = user;
	this.length = length;
	this.width = width;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public int getLength() {
	return length;
}
@Required
public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}


public void display() {
	System.out.println("The details of the box are");
	System.out.println("The length of the box is: "+length);
	System.out.println("The width of the box is: "+width);
	System.out.println("This is owned by: "+user.getName());
}

}
