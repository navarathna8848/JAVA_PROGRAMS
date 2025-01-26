import java.util.Scanner;

class FootAcc
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();

		}

        
        int max=0;

		for(int i=0;i<=n-k;i++)
		{
			int subarr[]=new int[k];

			int sum=0;
			for(int j=0;j<k;j++)
			{
				subarr[j]=arr[i+j];
				sum+=subarr[j]*(j+1);
				
			}
			if(sum>max)
				{
					max=sum;
				}

		}
		System.out.println(max);

		
	}
}


