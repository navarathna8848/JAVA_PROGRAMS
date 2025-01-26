import java.util.Scanner;
class MethodOverloadExample

{
	public static int multiply(int a,int b) 
	{
		
		int c=a*b;
		return c;

	}
	

	public static int multiply(int a,int b, int c) 

	{
		int d=a*b*c;
		return d;

	}
	public static void main(String[] args) 
	{
        
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a value:");
		int a=sc.nextInt();

		System.out.println("enter b value:");
		int b=sc.nextInt();

		System.out.println("enter c value:");
		int c=sc.nextInt();

		int res1=multiply(a,b);
		System.out.println("the product of two valus is "+res1);

		int res2=multiply(a,b,c);
		System.out.println("the product of Three valus is "+res2);



	}
}