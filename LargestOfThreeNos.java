import java.util.Scanner;

class LargestOfThreeNos
{
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);

		System.out.println("Enter the num1:");
		int a1=a.nextInt();

		System.out.println("Enter the num2:");
		int b1=a.nextInt();

		System.out.println("Enter the num3:");
		int c1=a.nextInt();

		if (a1>b1) 
		{
			if (a1>c1) 
				System.out.println("a1 is greater");

			else
				System.out.println("c1 is greater");

		}


		else
			System.out.println("b1 is greater");

	}
}	