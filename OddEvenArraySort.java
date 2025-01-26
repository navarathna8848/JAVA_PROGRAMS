//write a program to remove duplicates from array 
import java.util.Scanner;
import java.util.Arrays;

class OddEvenArraySort
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

		
        int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				count++;

		}
		System.out.println("The arrays with odd values count "+count);

		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				count1++;
		}
		System.out.println("The arrays with odd values count "+count1);



		int a1[]=new int [count];

		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			a1[k++]=a[i];
		}
		System.out.println("the odd array is "+Arrays.toString(a1));

		int a2[]=new int [count1];

		int l=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			a2[l++]=a[i];
		}
		System.out.println("the odd array is "+Arrays.toString(a2));

		int a3[]=new int[size];

        int z=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<a1.length)
			a3[i]=a1[i];

		    else 
		    a3[i]=a2[z++];	
		}
		System.out.println("After merging the arrays "+Arrays.toString(a3));





		
	}
}
