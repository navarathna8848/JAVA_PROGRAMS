///compound interest  CI--->p * (1+rate/100)^n - p

import java.util.Scanner;
class CompoundInterest 
{
	
	public static float power() 
	{
		
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the rate ");
	    float rate=sc.nextFloat();

	    System.out.println("enter the time ");
		int n=sc.nextInt();
		float a=(1+rate/100);

		float pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*a;
		}
		return pow;
		
	}
	public static float CI() 
	{
		
		
        System.out.println();
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the principal amount ");
		int p=sc.nextInt();
		
        float pow=power();   
		
		float ci=p * pow - p;
		return ci;	
	}	

	public static void main(String[] args) 
	{
		
		System.out.println("enter the inputs :");
		
		
           float ci=CI();
           System.out.println(ci);
          
	}

}