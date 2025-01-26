//write a  program to sort array in ascending order

import java.util.Scanner;
import java.util.Arrays;

class AscendArray
{
	public static void ascend() 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int[size];

	    
         System.out.println("enter the value :");
`
	    for(int i=0;i<a.length;i++)
	     {
	 	       a[i]=sc.nextInt();
	     }
          
          System.out.println("before sorting in ascending order : ");
	      System.out.println(Arrays.toString(a));

	    for(int i=0;i<a.length-1;i++)
	    {
             for(int j=i+1;j<a.length;j++)
	         if(a[i]>a[j])
	         {
                int temp=a[i];
          	    a[i]=a[j];
                a[j]=temp;
	         }
	         
	    }
        	    
        /* for(int i=0;i<a.length-1;i++)

        {
        	if(a[i]>a[i+1])
        	{
              int temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp;

              i=-1;
        	}
        } */	    
           
            System.out.println("After sorting in ascending order : "); 
           System.out.println(Arrays.toString(a));
			
     }

	public static void main(String[] args) 
	{
		
           ascend();
	}

}