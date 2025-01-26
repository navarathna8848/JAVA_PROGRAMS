interface Shapes
{
	public static final String colour="blue";

	
	abstract public double area();
}

class Rect implements Shapes
{

	int length;
	int breadth;

	Rect(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public double area()
	{
		double areas=length*breadth;
		return areas;
	}

}
class Circle implements Shapes
{
	int radius;

	Circle(int radius)
	{
		this.radius=radius;
	}
	@Override
	public double area()
	{
		double areas1=3.14*radius*radius;
		return areas1;
	}

	

}

class Square implements Shapes
{
	int side;

	Square(int side)
	{
		this.side=side;
	}

	@Override
	public double area()
	{
		
		double areas2=side*side;
		return areas2;
	}

} 

class InterfaceShapes
{
	public static void main(String[] args) 
	{
		Shapes s;
		s=new Rect(3,8);
		System.out.println("the area of rectangle is :"+s.area()+ " and the colour is :"+ s.colour);

		s=new Circle(6);
		System.out.println("the area of circle is :"+s.area()+" and the colour is : "+ s.colour);

		s=new Square(4);
		System.out.println("the area of Square is :"+s.area()+ " and the colour is "+ s.colour);
		
	}
}