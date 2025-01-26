//find the missing number in array

import java.util.Scanner;
class MissingNumber
{
	public static void MissingNo() 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b;
		
        int sum=0;

         System.out.println("enter the value ");

	    for(int i=0;i<a.length;i++)
	     {
	 	       a[i]=sc.nextInt();
	     }

		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}

	    b= size* (size+1)/2;
		int missedno=b-sum;
		System.out.println(missedno);    	
     }

	public static void main(String[] args) 
	{
		
           MissingNo();
	}

}