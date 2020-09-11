package inheritnceabstractclasspolymorphism;
import java.util.*;

import java.time.LocalDate;

public abstract class Medicine {
protected String Name;
protected double Price;
protected String ExpiryDate;

public Medicine() {}

protected Medicine(String name, double price, String expiryDate) {
	super();
	Name = name;
	Price = price;
	ExpiryDate = expiryDate;
}

protected String getName() {
	return Name;
}

protected void setName(String name) {
	Name = name;
}

protected double getPrice() {
	return Price;
}

protected void setPrice(double price) {
	Price = price;
}

protected String getExpiryDate() {
	return ExpiryDate;
}

protected void setExpiryDate(String expiryDate) {
	ExpiryDate = expiryDate;
}

void getDetails() {
	
}
void   displayLabel() {
	
}
}
