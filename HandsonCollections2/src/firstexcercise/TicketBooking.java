package firstexcercise;

import java.util.Comparator;

public class TicketBooking implements Comparator {

	private String customerName;
	private int  price;
	
	public TicketBooking() {
		
	}

	protected TicketBooking(String customerName, int price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	protected String getCustomerName() {
		return customerName;
	}

	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(Integer price) {
		this.price = price;
	}

    public int compare(Object a,Object b) {
		TicketBooking T1=(TicketBooking)a;
		TicketBooking T2=(TicketBooking)b;
		if(T1.price<T2.price)
			return -1;
		else if(T1.price>T2.price)
			return 1;
		else
			return 0;
	}
    
    public String toString() {
    	return Integer.toString(price);
    }
}
