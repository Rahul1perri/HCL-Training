package handson1;
import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, 
	 IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
Main m=new Main();
m.display();
System.out.println("Choose an Shape");
int a=Integer.parseInt(br.readLine());
switch(a) {
case 1:
	Circle c=new Circle();
	System.out.println("Enter the Radius");
	float r=Float.parseFloat(br.readLine());
	c.setRadius(r);
	double b=c.calculatePerimeter();
	System.out.println("The Perimeter is : "+b);
	break;
	
case 2:
	Rectangle R=new Rectangle();
	System.out.println("Enter the length");
	float l=Float.parseFloat(br.readLine());
	R.setLength(l);
	float B=Float.parseFloat(br.readLine());
	R.setBreadth(B);
	double P=R.calculatePerimeter();
	System.out.println("The Perimeter is : "+P);
	break;
	
case 3:
	Square S=new Square();
	System.out.println("Enter the Side");
	float s=Float.parseFloat(br.readLine());
	S.setSide(s);
	double L=S.calculatePerimeter();
	System.out.println("The Perimeter is : "+L);
	break;
}
}
	}
void display() {
	System.out.println("List of Shapes");
	System.out.println("1. Circle");
	System.out.println("2. Rectangle");
	System.out.println("3. Square");
}
}
