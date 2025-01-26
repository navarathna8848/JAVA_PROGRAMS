//create a parent class ( 1 data member 1 static method and 1 non static method )and child class (1 data member and 1 static method and 1 non static method)

class Parent
{
	int a=10;
	private int n=100;

	public static void m1()
	{

		System.out.println("in m1 method ");
	}

	public void m2()
	{
		System.out.println(n);
		System.out.println("in m2 method ");
	}	
}

class Child extends Parent
{
	int b=40;

	public static void m3()
	{
		System.out.println("in m3 method ");
	}

	public void m4()
	{
		System.out.println(n);// CTE because the scope of private is within the class only
		System.out.println("in m4 method");
	}
}

class ParentChildMain

{
	public static void main(String[] args) 
	{
		Parent p=new Parent();	
		System.out.println(p.a);
		p.m1();
		p.m2();

		//p.m3(); CTE

		System.out.println("-------------------------------");

		Child c=new Child();
		System.out.println(c.a);
		c.m1();
		c.m2();

		System.out.println(c.b);
		c.m3();
		c.m4();
		
	}

}