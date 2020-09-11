package inheritnceabstractclasspolymorphism;

public class Ointment extends Medicine {

	public Ointment() {
		super();
	}
	
	protected Ointment(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	void getDetails() {
		System.out.println("Medicine Details: ");
		
	}
	void   displayLabel() {
		System.out.println("For external use only");
	}
	
	
}
