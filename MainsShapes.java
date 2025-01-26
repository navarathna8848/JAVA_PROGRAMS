class Shapess
{
	private String colour;

	public Shapess(String colour)
	{
		this.colour=colour;
	}

	public String getColour()
	{
		return colour;
	}

	public void setColour(String colour)
	{
		this.colour=colour;
	}

	public void CalculateArea()
	{


	}
}
class Circle extends Shapess
{
	double radius;

	public Circle(double radius,String colour)
	{
		super(colour);
		this.radius=radius;

	}

	@Override
	public void CalculateArea()
	{
		double r=3.14*radius*radius;
		System.out.println("the area of circle is "+r+" and the colour is "+getColour());
	}

}
class Rectangle extends Shapess
{
	int length;
	int breadth;

	public Rectangle(int length,int breadth,String colour)
	{
		super(colour);
		this.length=length;
		this.breadth=breadth;

	}

	@Override
	public void CalculateArea()
	{
		double a=length*breadth;
		System.out.println("the area of Rectangle is "+a+" and the colour is "+getColour());
	}
}
class MainsShapes
{
	public static void main(String[] args) 
	{
		Circle c=new Circle(3,"blue");
		c.CalculateArea();

		Rectangle rec=new Rectangle(4,2,"red");
		rec.CalculateArea();


		
	}
}