package Classandobjectfourthexcercise;



public class Product {
	private	int product_code;
	private	String product_name;
	private	double price;
	private	int stock;
	private	String Staticname;
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
	public String getStaticname() {
		return Staticname;
	}
	public void setStaticname(String staticname) {
		Staticname = staticname;
	}
	public Product() {
		
	}
	public Product(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}
	
	void Menu() {
		
		System.out.println("Menu");
		System.out.println("1. Add Products");
		System.out.println("2. Display Products");
		System.out.println("3. Get Discounted Price");
		System.out.println("4. Find Costly Product");
		System.out.println("5. Check Min Stock");
		System.out.println("6. Exit");
	}
	
	void display(Product goods[]) {
		System.out.println(Staticname);
		System.out.println("Product Code: "+product_code);
		System.out.println("Product name: "+product_name);
		System.out.println("Price: "+price);
		System.out.println("Stock: "+stock);
	}
	void getDiscountedPrice1(Product goods[] ) {
		double a;
		if (price>=80000 ){
			 a=0.3*price;
		}else if(price>=60000){
			 a=0.2*price;
		}else if(price>=50000) {
			 a=0.1*price;
		}else{
			 a=0.05*price;
		}

		System.out.println("Discount Price: "+"for"+product_name +a);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
