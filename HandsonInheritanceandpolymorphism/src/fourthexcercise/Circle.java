package fourthexcercise;

public class Circle extends Shape{

	protected double radius;
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void computeArea() {
		 area=(22/7)*(radius*radius);
	}
	
	
	
	
	
	
	
	
	
}
