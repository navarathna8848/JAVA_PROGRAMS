import java.util.Scanner;
class PrimeNumberEncaps
{
	private int num;

	public int getNum()
	{
		
		return num;
	}

	public void setNum(int num)
	{
		int count=0;

		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			count++;
		    } 
		}

		if(count==2)
		
		 {
		     this.num=num;
             System.out.println("the number is  a prime number");
         }
		
        else
             System.out.println("the number is not a prime number");
        

	}


}