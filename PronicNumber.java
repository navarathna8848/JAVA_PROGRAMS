// pronic number  5*6=30 is pronic , 10*11=110 is pronic , 5*5=25 is not a pronic 

import java.util.Scanner;
class PronicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number you want to check  ");
		int num = sc.nextInt();

	

		for(int i=1; i*(i+1)<=num ;i++)
		{
			if(i*(i+1)==num)
			{
				System.out.println("this is pronic number ");
				return;
			}
				
		}
		System.out.println("this is not a pronic number ");
		
		
	}
}