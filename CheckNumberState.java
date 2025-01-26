import java.util.Scanner;

class CheckNumberState
{
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);

		System.out.println("Enter the num1:");
		int a1=a.nextInt();

		if (a1>0)
		    System.out.println(a1+ " is positive ");

		else if (a1==0)
		    System.out.println(a1+ " is equal to 0 ");

		else 
		    System.out.println(a1+ " is negative ");


	}
}
	
	