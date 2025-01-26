import java.util.Scanner;
class MarksSwitch
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the mark");
	int mark=sc.nextInt();
     
    mark=mark/10;

	switch(mark)
	{
		case 10,9:
		System.out.println("A+");
		break;

		case 8:
		System.out.println("A");
		break;

		case 7:
		System.out.println("B+");
		break;

		case 6:
		System.out.println("B");
		break;

		case 5:
		System.out.println("C");
		break;

		case 4:
		System.out.println("D");
		break;

		default:
		System.out.println("Fail give supplement once again");
		break;

	}


	}
}