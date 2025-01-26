//write a program to find area of shape[triangle,circle,rectangle]with the help of method overloading 
import java.util.Scanner;
class ShapesArea
{
	public static void Shapes(double b,double h)
	{
		double triangle=0.5*b*h;
		System.out.println("the area of triangle is "+triangle);
	}
	public static void Shapes(float l,float b)
	{
		double rectangle=l*b;
		System.out.println("the area of rectangle is "+rectangle);
	}

	public void Shapes(double r)
	{
		double circle=3.14*r*r;
		System.out.println("the area of circle is "+circle);
	}
}

class AreasMain1
{
	public static void main(String[] args) 
	{
		ShapesArea.Shapes(12.0d,34.0d);
		ShapesArea.Shapes(12.0f,34.0f);
		ShapesArea s=new ShapesArea();
		s.Shapes(3d);
	}
}
