package handson1;

public class Rectangle extends Shape{

	private float length;
	private float breadth;
	
	
	protected float getLength() {
		return length;
	}


	protected void setLength(float length) {
		this.length = length;
	}


	protected float getBreadth() {
		return breadth;
	}


	protected void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	public double calculatePerimeter() {
		double a=2*(length+breadth);
		return a;
	}
	
	
	
	
}
