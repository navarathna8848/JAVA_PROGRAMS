//write a program to find x to the power n
import java.util.Scanner;


class Power
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the X value ");
		int x=sc.nextInt();
		
		System.out.println("enter the n value ");
		int n=sc.nextInt();

		double y=Math.pow(x,n);
		System.out.println("the power of the number is "+(int)y);


		
	}
}