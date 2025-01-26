import java.util.Scanner;

class LargestOf3Nums
{
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);

		System.out.println("Enter the num1:");
		int a1=a.nextInt();

		System.out.println("Enter the num2:");
		int b1=a.nextInt();

		System.out.println("Enter the num3:");
		int c1=a.nextInt();

		int large=(a1>b1)?((a1>c1)? a1:c1):((b1>c1)? b1:c1);


		System.out.println("Largest of three numbers :"+large);
 
	}
	
}