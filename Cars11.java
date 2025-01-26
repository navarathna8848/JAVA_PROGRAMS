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

class Bmw extends Car
{

	double prices=12345d;
}	


class Cars11 
{    

     public static void addCar(Car c)
		{
			if(c instanceof Nano)
			{
				Nano n=(Nano)c;
				System.out.println(n.colour);
				System.out.println(n.price);
			}
	
			else
			{
				Bmw b=(Bmw)c;
				System.out.println(b.prices);
			}

		}	
		

		
		public static void main(String[] args) 
		{

			addCar(new Nano());
		}
	
}