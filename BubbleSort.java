//write a program  for bubble sort 
import java.util.Scanner;
import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of the element :");
		int size=sc.nextInt();

		
		int arr[]=new int[size];


        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length;i++)
        {
        	for(int j=1;j<arr.length-i;j++)
        	{
        		if(arr[j-1]>arr[j])
        		{
        			int temp=arr[j-1];
        			arr[j-1]=arr[j];
        			arr[j]=temp;

        		}
        	}
        }
        System.out.println("After buble sorting "+Arrays.toString(arr));
    }

}
