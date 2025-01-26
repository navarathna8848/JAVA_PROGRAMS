import java.util.Scanner;


class PowerUsingFor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the n value ");
		int n=sc.nextInt();

		System.out.println("enter the X value ");
		int x=sc.nextInt();

		int pow=1;

		for(int i=1;i<=n;i++)
		{
             pow=pow*x;
		}
		System.out.println("the power of a number is "+pow);
	}
}