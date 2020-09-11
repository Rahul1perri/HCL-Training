package inheritnceabstractclasspolymorphism;

public class Syrup extends Medicine {

	public Syrup() {
		super();
	}
	
	protected Syrup(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	
	void getDetails() {
		System.out.println("Medicine Details: ");
		
	}
	void   displayLabel() {
		System.out.println("For Internal consumtion only");
	}
}
