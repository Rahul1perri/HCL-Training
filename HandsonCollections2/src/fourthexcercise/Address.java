package fourthexcercise;

public class Address implements Comparable<Address>{

private String username;
private String addressLine1;
private String addressLine2;
private int pincode;

public Address() {
	
}

protected Address(String username, String addressLine1, String addressLine2, int pincode) {
	super();
	this.username = username;
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.pincode = pincode;
}

protected String getUsername() {
	return username;
}

protected void setUsername(String username) {
	this.username = username;
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

protected int getPincode() {
	return pincode;
}

protected void setPincode(int pincode) {
	this.pincode = pincode;
}


	@Override
	public int compareTo(Address o) {
		int P=this.pincode;
		int P2=o.pincode;
		if(P<P2) {
			return -1;
		}else if(P>P2) {
			return 1;
		}else {
			String ad1=this.addressLine1;
			String ad2=o.addressLine1;
			if(ad1.charAt(0)<ad2.charAt(0)) {
				return -1;
			}else if(ad1.charAt(0)<ad2.charAt(0)) {
				return 0;
			}else
				return 0;
		}
	}
	
	
	public String toString() {
		System.out.println(" ");
		System.out.println(username+"\t"+addressLine1+"\t"+addressLine2+"\t"+pincode);
		return " ";
	}
	
	
	
	
	
}
