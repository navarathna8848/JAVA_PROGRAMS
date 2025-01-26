import java.util.Scanner;

class PerfectSquare2
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int num=sc.nextInt();

		for(int i=1; i*i<=num ;i++)
		{
			if(i*i==num)
			{
				System.out.println("the number is perfect square ");
			    return;
			}
				
		}
		System.out.println("the number is not perfect square ");
	}
}