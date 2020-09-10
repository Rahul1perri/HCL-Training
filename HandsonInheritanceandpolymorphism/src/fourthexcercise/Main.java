package fourthexcercise;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Main m=new Main();
while(true) {
	m.menu();
	int a=Integer.parseInt(br.readLine());
	switch(a) {
	case 1:
		Circle c=new Circle();
		System.out.println("Enter the radius:");
		double Radius=Double.parseDouble(br.readLine());
		c.setRadius(Radius);
		c.computeArea();
		System.out.println("The area of circle is: %.2f "+c.getArea());
		
		break;
	case 2:
		Rectangle r=new Rectangle();
		System.out.println("Enter the length and breath");
		double Length=Double.parseDouble(br.readLine());
		r.setLength(Length);
		double Breadth=Double.parseDouble(br.readLine());
		r.setBreadth(Breadth);
		r.computeArea();
		System.out.println("The area of rectangle is: %.2f "+r.getArea());
		
		break;
	case 3:
		Triangle t=new Triangle();
		System.out.println("Enter the base and height");
		double Base=Double.parseDouble(br.readLine());
		t.setBase(Base);
		double Height=Double.parseDouble(br.readLine());
		t.setHeight(Height);
		t.computeArea();
		System.out.println("The area of triangle is: %.2f "+t.getArea());
		
	    break;
	
	}
	}}
	void menu() {
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
	}

}
