
class A
{
	

	A()
	{
		System.out.println("y");

	}

	A(int a)
	{

		this();
		System.out.println("x");

	}
	
	A(int a,int b)
	{
		this(2);
		System.out.println("z");
	}

	public static void main(String[] args) 
	{
		A a=new A(10,20);
	}
}