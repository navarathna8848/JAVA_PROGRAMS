//write a program to check whether given number is a prime number
import java.util.Scanner;
class PrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value ");
		int n=sc.nextInt();



		int count=0;

		

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;
		    } 
		}

		if(count==2)
		
             System.out.println("the number is  a prime number");
		
        else
             System.out.println("the number is not a prime number");
        
                  
          
	}

}
