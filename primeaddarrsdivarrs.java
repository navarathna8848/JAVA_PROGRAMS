import java.util.Scanner;
import java.util.Arrays;

class primeaddarrsdivarrs
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit value : ");
		int n=sc.nextInt();

       
		int prime[]=new int[n];
		int j=0;


		for(int num=2;num<=n;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
		
       
		if(count==2)
		{
              prime[j++]=num;
		}

	
	    }
	    prime = Arrays.copyOf(prime, j);
	    System.out.print(Arrays.toString(prime));
	    System.out.println();



		System.out.println("enter the size ");
		int size=sc.nextInt();

		System.out.println("enter the values ");
		int a1[]=new int[size];

		
        for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("the arrays "+Arrays.toString(a1));


		System.out.println("enter the values ");
		int a2[]=new int[size];


		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		System.out.println("the arrays "+Arrays.toString(a2));

		for(int i=0;i<prime.length;i++)
		{
			for(int k=0;k<a1.length;k++)
			{
				int b=a1[k]+prime[i];

				if(b%a2[i]==0)
				{
					System.out.println("it divides exactly "+b);
             
				}
				else
				{
					System.out.println("not diviible "+b);
				}
			}
		}







	}
}