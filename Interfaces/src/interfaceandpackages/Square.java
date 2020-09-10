package interfaceandpackages;

public class Square implements Polygon{

	private double side;
	
	protected Square(double side) {
		super();
		this.side = side;
	}
	public  void calcPeri() {
		double s=4*side;
		System.out.println("The perimeter of the square is: "+s);
	}
	public  void calcArea() {
		double s=side*side;
		System.out.println("The area of the square is: "+s);
	}
	
	
	
}
