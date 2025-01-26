import java.util.Scanner;
class AppleOrange
{
	public static void main(String[] args) 
	{
		int a=4;
		int b=12;
		int s=7;
		int t=10;
		int apples[]={2,3,-4};
		int oranges[]={3,-2,-4};

		int count=0;


		for(int i=0;i<apples.length;i++)
		{
			int x=a+apples[i];

			if(s<=x && x<=t)
				count++;
		}
		System.out.println("the apple count is :"+count);


        int count1=0;

		for(int i=0;i<oranges.length;i++)
		{
			int y=b+oranges[i];

			if(s<=y && y<=t)
				count1++;
		}
		System.out.println("the orange count is :"+count1);
		
	}
	
}
