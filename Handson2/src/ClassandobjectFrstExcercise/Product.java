package ClassandobjectFrstExcercise;

public class Product {
int product_code;
String product_name;
double price;
int stock;
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
public Product() {
	
}
public Product(int product_code, String product_name, double price, int stock) {
	super();
	this.product_code = product_code;
	this.product_name = product_name;
	this.price = price;
	this.stock = stock;
}

void checkPrice(Product item1,Product item2) {
if (item1.getPrice()<item2.getPrice()) {
	System.out.println(item1.getProduct_name()+" "+"is cheaper than"+" "+item2.getProduct_name());
}else {
	System.out.println(item2.getProduct_name()+" "+"is cheaper than"+" "+item1.getProduct_name());
}
}

void Display() {
	System.out.println("Product Code:"+product_code);
	System.out.println("Product Name:"+product_name);
	System.out.println("Price:"+price);
	System.out.println("Stock:"+stock);

}




}
