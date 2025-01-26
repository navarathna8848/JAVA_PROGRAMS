import java .util.Scanner;
class ArmstrongNumber
{
	public static int count(int num) 
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

	public static int power(int x,int n) 
	{
		int pow=1;
		for(i=1;i<=n;i++)
		{
			pow=pow*x;
		}

	}

	public static int armstrong(int num) 
	{
	  int count=count(num);
	  int sum=0;
	  int temp=num;

	while(num>0)
	{
		last= num % 10;
		int power=power(last,count);
		sum=sum+power;
		num = num / 10;

		
	}
	if(sum==temp)
		System.out.println("Armstrong");
	else
		System.out.println("not Armstrong");	
	}


	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number you want: ");
	int num=sc.nextInt();
	
	armstrong(num);
}
}
