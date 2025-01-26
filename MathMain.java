//write a program to perform mathematical operations (add,sub,mul,div) with two and three numbers
class MathsOp
{
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the addition of two numbers "+c);
	}

	public static void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("the addition of three numbers "+d);
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("the subtraction of two numbers "+c);
	}
	public static void sub(int a,int b,int c)
	{
		int d=a-b-c;
		System.out.println("the subtraction of three numbers "+d);
	}
	public static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("the multiplication of two numbers "+c);
	}
	public static void mul(int a,int b,int c)
	{
		int d=a*b*c;
		System.out.println("the multiplication of three numbers "+d);
	}
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println("the division of two numbers "+c);
	}
}
class MathMain
{
	public static void main(String[] args) 
	{
        MathsOp.add(3,4);
		MathsOp.add(1,2,3);

		MathsOp.sub(4,2);
		MathsOp.sub(8,7,3);

		MathsOp.mul(8,2);
		MathsOp.mul(5,2,3);

		MathsOp.div(25,5);


		
	}
}