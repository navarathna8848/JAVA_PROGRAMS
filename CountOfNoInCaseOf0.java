//write a program to count no. of digits when the number is zero
import java.util.Scanner;
class CountOfNoInCaseOf0
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number you want to count ");
		int num=sc.nextInt();
		int count=0;

		if(num==0)
		{
			count++;
		}

		else
		{

		 while(num>=0)
		 {
		 	count++;
		 	num=num/10;

		 }
		}
		 System.out.println("the num is  "+num);
		 System.out.println("the count is "+count);

	}
	
}