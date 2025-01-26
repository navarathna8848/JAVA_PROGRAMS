class Laptop
{
	String brand;
	int model;
	double price;
	int ram;

	Laptop()
	{

	}

	Laptop(String brand)
	{
		this();
		this.brand=brand;
	}

	Laptop(String brand,int model)
	{
		this(brand);
		this.model=model;
	}

	Laptop(String brand,int model,double price)
	{
		this(brand,model);
		this.price=price;
	}

	Laptop(String brand,int model,double price,int ram)
	{
		this(brand,model,price);
		this.ram=ram;

	}

	public void Display()
	{
		System.out.println("the brand is :"+brand);
		System.out.println("the model is :"+model);
		System.out.println("the price is :"+price);
		System.out.println("the ram is :"+ram);

	}



	
}