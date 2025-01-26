//write a program to remove duplicates from array 
import java.util.Scanner;
import java.util.Arrays;

class DuplicatesArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size ");
		int size=sc.nextInt();

		System.out.println("enter the values ");
		int a[]=new int[size];


		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the arrays "+Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
			int isVisited=-1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					a[j]=isVisited;
					
			}
		}
		System.out.println("The arrays with repeated values "+Arrays.toString(a));

		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==-1)
				count++;
		}
		System.out.println("the repeated values count is "+count);

		int a1[]=new int [size-count];

		int counts=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			a1[counts++]=a[i];
		}
		System.out.println("the non repeated array is "+Arrays.toString(a1));

	}
}


/* int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
	           if(a[i]!=-1 && a[j]!=-1 && a[i]==a[j])
	           {
	           	a[j]=-1;
				count++;
			   }
			}
			
		}

		int a1[]=new int [size-count];

		int counts=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			a1[counts++]=a[i];
		}
		System.out.println("the non repeated array is "+Arrays.toString(a1));  */
		
