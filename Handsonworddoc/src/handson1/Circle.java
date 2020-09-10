package handson1;

public  class Circle extends Shape {

	private float radius;
	

	protected float getRadius() {
		return radius;
	}


	protected void setRadius(float radius) {
		this.radius = radius;
	}


	public  double calculatePerimeter() {
		double a=2*3.14*radius;
		return a;
	}

	
}
