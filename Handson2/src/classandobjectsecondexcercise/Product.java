package classandobjectsecondexcercise;

public class Product  {
	int product_code;
	String product_name;
	double price;
	int stock;
	String Staticname;
	
	public String getStaticname() {
		return Staticname;
	}
	public void setStaticname(String staticname) {
		Staticname = staticname;
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	void getDiscountedPrice1(Product goods ) {
		double a;
		if (goods.getPrice()>=80000 ){
			 a=0.3*goods.getPrice();
		}else if(goods.getPrice()>=60000){
			 a=0.2*goods.getPrice();
		}else if(goods.getPrice()>=50000) {
			 a=0.1*goods.getPrice();
		}else{
			 a=0.05*goods.getPrice();
		}
	
		System.out.println("Discount Price: "+a);
		
	}
	
	void checkPrice(Product goods1,Product goods2) {
		if (goods1.getPrice()<goods2.getPrice()) {
			System.out.println(goods1.getProduct_name()+" "+"is cheaper than"+" "+goods2.getProduct_name());
		}else {
			System.out.println(goods2.getProduct_name()+" "+"is cheaper than"+" "+goods1.getProduct_name());
		}
	}
	void Display() {
		System.out.println(Staticname);
		System.out.println("Product Code: "+product_code);
		System.out.println("Product name: "+product_name);
		System.out.println("Price: "+price);
		System.out.println("Stock: "+stock);
		
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

