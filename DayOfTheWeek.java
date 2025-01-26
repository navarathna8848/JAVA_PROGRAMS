import java.util.Scanner;
class DayOfTheWeek
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

    System.out.println("enter your choice");
	int choice=sc.nextInt();

	switch(choice)
	{
		case 1:
		{
		System.out.println("Day of the week is monday ");
		break;
	    }

		case 2:
		{
		System.out.println("Day of the week is tuesday ");
		break;
	    }

		case 3:
		{
		System.out.println("Day of the week is wednesday ");
		break;
	    } 

	    case 4:
		{
		System.out.println("Day of the week is thursday ");
		break;
	    } 

	    case 5:
		{
		System.out.println("Day of the week is friday ");
		break;
	    } 

	    case 6:
		{
		System.out.println("Day of the week is saturday ");
		break;
	    } 

	    case 7:
		{
		System.out.println("Day of the week is sunday ");
		break;
	    } 

		default:
		{
		System.out.println("invalid options");
		break;
	    }

	}


	}
}