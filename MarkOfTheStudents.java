import java.util.Scanner;

class MarkOfTheStudents
{
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);

        System.out.println("enter the mark");
		int marks=a.nextInt();

		if(marks==100)
			System.out.println("Excellent");

		else if(marks>=91 && marks>100)
			System.out.println("A+");

		else if(marks>=81 && marks<=90)
			System.out.println("A");

		else if(marks>=71 && marks<=80)
			System.out.println("B+");

		else if(marks>=61 && marks<=70)
			System.out.println("B");

		else if(marks>=51 && marks<=60)
			System.out.println("B");

		else if(marks>=40 && marks<=50)
			System.out.println("B");

		else
			System.out.println("Fail");

			

	}
}