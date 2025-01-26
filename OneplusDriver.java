class Phone
{
	private String os;

	public String getOs() //getter because of private 
	{
		return os;
	}

	Phone() //recommmended
	{

	}

	Phone(String os)
	{
		this.os=os;

	}

}
class Oneplus extends Phone
{
	String brand;
	double price;
	int model;

	public Oneplus(String brand,double price,int model,String os)

	{
		super(os);
		this.brand=brand;
		this.price=price;
		this.model=model;

	}
	public void Display()
	{
		System.out.println("the brand is "+brand);
		System.out.println("the price is "+price);
		System.out.println("the model is "+model);
		System.out.println("the os is "+getOs());
	}
}
class OneplusDriver
{
	public static void main(String[] args) 
	{
		Oneplus o=new Oneplus("o",13000.0,17,"windows");
		o.Display();


		
	}
}