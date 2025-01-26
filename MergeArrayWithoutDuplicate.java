//write a program to merge two arrays
import java.util.Scanner;
import java.util.Arrays;
class MergeArrayWithoutDuplicate
{
	public static void main(String[] args) 
	
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size: ");
    int size=sc.nextInt();

    int a[]=new int[size];
    int b[]=new int[size];

    int c[]=new int[a.length+b.length];
   
   System.out.println("Enter the values for array 1: ");
   for(int i=0;i<a.length;i++)
   {
   	a[i]=sc.nextInt();
   }

   System.out.println("Enter the values for array 2: ");
   for(int i=0;i<b.length;i++)
   {
   	b[i]=sc.nextInt();
   }

   int k=0;
   for(int i=0;i<c.length;i++)
   {
    
    if(i<a.length)
   	   c[i]=a[i];
     
    else
       c[i]=b[k++];//c[i]=b[i-a.length];

  
   }
 	System.out.print(Arrays.toString(c));

  
    
    //non duplicate element in an array


    int digit=0;
    for(int i=0;i<c.length;i++)
    {
       for(int j=i+1;j<c.length;j++)
      {
        if(c[i]==c[j])
          digit++;
          
      }
    }
    System.out.println("the count of repeated values "+digit);

    

    int a11[]=new int [digit];

    int counts1=0;
    for(int i=0;i<c.length;i++)
    {
      for(int j=i+1;j<c.length;j++)
      {
      if(c[i]==c[j])
      a11[counts1++]=c[i];
      }
    }
    System.out.println("the repeated element in array is "+Arrays.toString(a11));


    //duplicate element in an array

    for(int i=0;i<c.length;i++)
    {
      int isVisited=-1;
      for(int j=i+1;j<c.length;j++)
      {
        if(c[i]==c[j])
          c[j]=isVisited;
          
      }
    }
    System.out.println("The arrays with repeated values "+Arrays.toString(c));

    int count=0;
    for(int i=0;i<c.length;i++)
    {
      if(c[i]==-1)
        count++;
    }
    System.out.println("the repeated values count is "+count);

    int a1[]=new int [c.length-count];

    int counts=0;
    for(int i=0;i<c.length;i++)
    {
      if(c[i]!=-1)
      a1[counts++]=c[i];
    }
    System.out.println("the non repeated array is "+Arrays.toString(a1));




		
	}
}