import java.util.Scanner;
import java.util.Arrays;
class KeerthanaAcc
{
	public static void main(String[] args) 
	{
		int [] arr={0,2,8,5,7,3,6,0,3,8};

		int [] even=new int[arr.length];
		int evencount=0;

		int [] odd=new int[arr.length];
		int oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(i%2==0)
			{
				even[evencount]=arr[i];
				evencount++;
			}
			else
			{
				odd[oddcount]=arr[i];
				oddcount++;

			}

		}
		System.out.println(evencount);
		System.out.println(oddcount);


		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

		int largest=even[0];
        int secondlargest=even[0];

        for(int i=0;i<evencount;i++)
        {
        	if(even[i]>largest)
        		largest=even[i];

        }

        System.out.println("the largest element is "+largest);

        for(int i=0;i<evencount;i++)
        {
        	if(even[i]>=secondlargest && even[i]<largest) 
        		secondlargest=even[i];
        	
        }

        System.out.println("the second largest element is "+secondlargest);


		int largest1=odd[0];
        int secondlargest1=odd[0];

        for(int i=0;i<oddcount;i++)
        {
        	if(odd[i]>largest1)
        		largest1=odd[i];

        }

        System.out.println("the largest element is "+largest1);

        for(int i=0;i<oddcount;i++)
        {
        	if(odd[i]>=secondlargest1 && odd[i]<largest1 		) 
        		secondlargest1=odd[i];
        	
        }

        System.out.println("the second largest element is "+secondlargest1);

        int add=secondlargest+secondlargest1;
        System.out.println(add);







		
	}
}