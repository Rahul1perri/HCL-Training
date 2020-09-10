package interfaceandpackages;

public class Rectangle implements Polygon {
private double length;
private double breadth;


protected Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
public  void calcPeri() {
		double p=2*(length+breadth);
		System.out.println("The perimeter of the Rectangle is: "+p);
	}
	public  void calcArea() {
		double p=length*breadth;
		System.out.println("The area of the Rectangle is: "+p);
	}
	
}
