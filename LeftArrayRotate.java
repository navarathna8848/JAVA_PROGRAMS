//write a program to left rotate an array

import java.util.Scanner;
import java.util.Arrays;

class LeftArrayRotate
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

	     int temp=a[0];

	     for(int i=1;i<a.length;i++)
	     {
	     	a[i-1]=a[i]; //we cam alse use the swapping concept to do this left rotate array
	     }

             a[a.length-1]=temp;
           
            System.out.println("After left rotate : "); 
           System.out.println(Arrays.toString(a));
			
     }

	public static void main(String[] args) 
	{
		
           LeftRotate();
	}

}