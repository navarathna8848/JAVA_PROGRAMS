abstract class Parent
{
	abstract public void m1();
	abstract public void m2();
	abstract public void m3();

	public static void m4()
	{
		System.out.println("m4 method ");
	}
}

abstract class Child extends Parent
{
	@Override
	public void m1()
	{
		System.out.println("m1 implementation ");
	}

	@Override
	public void m2()
	{
		System.out.println("m2 implementation ");
	}
	

}
class Child2 extends Parent
{

	@Override
	public void m1()
	{
		System.out.println("m1 implementation ");
	}

	@Override
	public void m2()
	{
		System.out.println("m2 implementation ");
	}

	@Override
	public void m3()
	{
		System.out.println("m3 implementation ");
	}

}
class AbstractMainBasics
{
	public static void main(String[] args) 
	{
		Child2 c=new Child2();
		c.m3();

		// Parent.m4();

		
	}
}
