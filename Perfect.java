//write a program to check whether given number is a perfect number
import java.util.Scanner;
class Perfect
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int num=sc.nextInt();

		
		int sum=0;
		for(int divisor=1;divisor<num;divisor++)
		{
			if(num%divisor==0)
			{
				sum=sum+divisor;
			}
		}	
			if(sum==num)
			{
				System.out.println("the number is perfect ");
			}
			else
			{
				System.out.println("the number is not a perfect ");
			}
		
	}
}