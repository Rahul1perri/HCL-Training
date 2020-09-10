package interfaceandpackages;
import java.util.*;
public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the square");
double u=sc.nextDouble();
System.out.println("Enter the length and breadth of the rectangle");
double t=sc.nextDouble();
double y=sc.nextDouble();
Square s=new Square(u);
s.calcPeri();
s.calcArea();
Rectangle r=new Rectangle(t,y);
r.calcPeri();
r.calcArea();		
		
		
		
	}

}
