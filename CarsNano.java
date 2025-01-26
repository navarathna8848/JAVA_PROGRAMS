//create two classes (parent and child )with two members each

class Car
{
	String colours="red";
}

class Nano extends Car
{
	String colour="yellow";
	double price=10000.32d;
	
}

class Honda extends Car
{

	double prices=12345d;


}
class CarsNano
{
	public static void main(String[] args) 
	{

		/*Nano n=new Nano();
		Car c=n;//upcasting

		System.out.println(c.colours);
		
		//System.out.println(c.price);

		Nano n1=(Nano)c;//downcasting
		System.out.println(n1.colours);
		System.out.println(n1.colour);
		System.out.println(n1.price);*/

		

		Nano n=new Nano();
		Car c=n;//upcasting

		Nano n1=(Nano)c;

		Honda h=new Honda();
		Car c1=h;

		Honda h1=(Honda)c1;

		System.out.println(h1.prices);
		System.out.println(h1.colours);

		System.out.println(n1.price);
		System.out.println(n1.colours);
		System.out.println(n1.colour);
		
	}
}

