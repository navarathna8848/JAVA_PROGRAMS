import java.util.Scanner;
import java.util.Arrays;

class KthSortedElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int arr1[]={2,4,7,1,3};
		int arr2[]={5,9,6,8,0};

		int arr3[]=new int[arr1.length+arr2.length];

        int n=0;
		for(int i=0;i<arr3.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];

			}
			else
			{
				arr3[i]=arr2[n++];
			}
			
		}

		System.out.println("merge arrays and before sorting "+Arrays.toString(arr3));

		
		
		/*for(int i=0;i<arr3.length;i++)
		{
			for(int j=i+1;j<arr3.length;j++)
			{
			if(arr3[i]>arr3[j])
			{
				int temp=arr3[i];
				arr3[i]=arr3[j];
				arr3[j]=temp;
			}
		   }
		}*/


		for(int i=0;i<arr3.length-1;i++)
		{
			
			if(arr3[i]>arr3[i+1])
			{
				int temp=arr3[i];
				arr3[i]=arr3[i+1];
				arr3[i+1]=temp;
			}
		   
		}
				System.out.println("sorted arrays "+Arrays.toString(arr3));


		
	    System.out.println("enter the index you want to fetch the particular value ");
	    int k=sc.nextInt();

	    System.out.println("the number in particular index is "+arr3[k]);
		
		
	}
}