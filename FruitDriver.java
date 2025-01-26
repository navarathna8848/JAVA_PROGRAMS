class Fruit
{
	String origin;

    Fruit()
    {

    }
    Fruit(String origin)
    {
    	this.origin=origin;

    }
}

class  Apple extends Fruit
{
	String taste;
	String colour;

	public Apple(String taste,String colour,String origin)
	{
		super(origin);
		this.taste=taste;
		this.colour=colour;
	}

	public void Display()
	{
		System.out.println("the taste is :"+taste);
		System.out.println("the colour is :"+colour);
		System.out.println("the origin is :"+origin);
	}
}

class Orange extends Fruit
{
	String taste;
	String colour;

	public Orange(String taste,String colour,String origin)
	{
		super(origin);
		this.taste=taste;
		this.colour=colour;
	}

	public void Display()
	{
		System.out.println("the taste is :"+taste);
		System.out.println("the colour is :"+colour);
		System.out.println("the origin is :"+origin);
	}

}
class FruitDriver
{
	public static void main(String[] args) 
	{
		Orange o=new Orange("sour","Orange","chennai");
		o.Display();

		Apple a=new Apple("apple","red","shimla");
		a.Display();
		
	}
}

