//write a program to left rotate an array

import java.util.Scanner;
import java.util.Arrays;

class LeftArrayRotate1
{
	public static void LeftRotate() 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int[size];

	    
         System.out.println("enter the value :");

	    for(int i=0;i<a.length;i++)
	     {
	 	       a[i]=sc.nextInt();
	     }
          
          System.out.println("before left rotate : ");
	      System.out.println(Arrays.toString(a));

	    
	     for(int i=0;i<a.length-1;i++)
	     {
	     	a[i+1]=a[i+1]+a[i];
	     	a[i]=a[i+1]-a[i];
	     	a[i+1]=a[i+1]-a[i];
	     }

                        
            System.out.println("After left rotate : "); 
           System.out.println(Arrays.toString(a));
			
     }

	public static void main(String[] args) 
	{
		
           LeftRotate();
	}

}