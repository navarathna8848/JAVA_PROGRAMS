import java.util.Scanner;

class LeapYearOrNot
{
	public static void main(String[] args)
	 {
		
		Scanner a=new Scanner(System.in);

		System.out.println("Enter the year:");
		int year=a.nextInt();


		if(year%4==0 && (year%400==0 || year%100!=0))
			System.out.println(a1+ "is leap year");



		else
			System.out.println(a1+ "is not leap year");
	
	}
}		
