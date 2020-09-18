package seventhexcercise;

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int pincode;
	
	public Address() {
		
	}

	protected Address(String addressLine1, String addressLine2, String city, String state, int pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	protected String getAddressLine1() {
		return addressLine1;
	}

	protected void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	protected String getAddressLine2() {
		return addressLine2;
	}

	protected void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	protected String getState() {
		return state;
	}

	protected void setState(String state) {
		this.state = state;
	}

	protected int getPincode() {
		return pincode;
	}

	protected void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-15s %-15s %s\n",addressLine1,addressLine2,city,state,pincode); 
		return "";		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
