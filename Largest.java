//write a program to find the largest element in an array
import java.util.Scanner;
class LargestSmallest
{
	public static void main(String[] args) 
	{
		
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the size of an array ");
	int size=sc.nextInt();

	System.out.println("enter the elements ");
	int a[]=new int[size];

	for(int i=0;i<a.length;i++)
	{
        a[i]=sc.nextInt();

	}

	int largest=a[0];
	

	for(int i=0;i<a.length;i++)
	{
         if(a[i]>largest)
         	largest=a[i];
	}
	System.out.println("the largest element in an array "+largest);

	int smallest=a[0];
	for(int i=0;i<a.length;i++)
	{
         if(a[i]<smallest)
         	smallest=a[i];
	}
	System.out.println("the smallest element in an array "+smallest);
	}
}