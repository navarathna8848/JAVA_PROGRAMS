//write a program to check the given number is neon number    { 9^2 =81 ----->8+1=9   }
import java.util.Scanner;
class NeonNumber
{
	public static void CheckNeon(int num) 
	{
		int square_num=num*num;
		int sum=0;
		
		while(square_num>0)
		{
			int last = square_num % 10;
			sum=sum+last;
			square_num=square_num / 10;
		}
		if(sum==num)
			System.out.println("the number is neon ");
		else
			System.out.println("the number is not neon ");

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		CheckNeon(num);

	}
}