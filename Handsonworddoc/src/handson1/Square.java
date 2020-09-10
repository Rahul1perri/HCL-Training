package handson1;

public class Square extends Shape {

	private float side;
	
	protected float getSide() {
		return side;
	}

	protected void setSide(float side) {
		this.side = side;
	}

	public double calculatePerimeter() {
		double a=4*side;
		return a;
	}
	
	
	
	
}
