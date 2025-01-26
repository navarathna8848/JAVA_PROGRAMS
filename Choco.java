import java.util.Scanner;
class ChocolateBar
{
	public static int makeChocolate(int smallBars,int largeBars,int goal)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the small bars weight ");
		int smallBarsWeight=sc.nextInt();

		System.out.println("enter the large bars weight ");
		int largeBarsWeight=sc.nextInt();

		int sum=smallBars*smallBarsWeight + largeBars*largeBarsWeight;
		System.out.println("the sum is "+sum);

			if(sum>=goal)
			{
				int remain=goal-(largeBars*largeBarsWeight);
				return remain;
			}

			else if (sum<goal) 
				return -1;
				
			
			else
				return 0;
		
	}

}
class Choco
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the small bars ");
		int smallBars=sc.nextInt();

		System.out.println("enter the large bars ");
		int largeBars=sc.nextInt();

		System.out.println("enter the goal ");
		int goal=sc.nextInt();

		int res=ChocolateBar.makeChocolate(smallBars,largeBars,goal);

		System.out.println("the result is "+res);
		
	}
}