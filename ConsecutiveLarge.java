 //write a program to add consecutive large elements in array

import java.util.Scanner;
class ConsecutiveLarge
{
	public static void main(String[] args) 
	{
	  
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];

    
	 int sum=0;
	 int maxnum=0;

	 System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }

	 	for(int i=0;i<a.length-1;i++)
	 	{
	 		sum=a[i]+a[i+1];

	 		if(maxnum<sum)
	 			maxnum=sum;


	 		
	 	}
	 	System.out.println("the consecutive largest number is  "+maxnum);
	}
}
