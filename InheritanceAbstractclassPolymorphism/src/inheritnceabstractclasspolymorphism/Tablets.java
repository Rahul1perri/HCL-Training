package inheritnceabstractclasspolymorphism;



public class Tablets extends Medicine{
	
	public Tablets() {
		super();
	}
	

	protected Tablets(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
		
	}
	
	void getDetails() {
		System.out.println("Medicine Details: ");
		
	}
	void   displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}
