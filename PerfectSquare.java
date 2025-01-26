import java.util.Scanner;

class PerfectSquare
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int num=sc.nextInt();

		int value=(int)Math.sqrt(num);
		int value1=(int)Math.pow(value,2);

		if(value1==num)
		{
			System.out.println("the number is perfect square number ");
		}
		else
		{
			System.out.println("the number is not perfect square number  ");
		}
	}
}
