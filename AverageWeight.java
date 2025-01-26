/*take the weight of five persons and calculate 
the avg of all five persons weight Results should be in whole number*/
import java.util.Scanner;
class AverageWeight
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the person's 1 weight ");
	float person1=sc.nextFloat();

	System.out.println("enter the person's 2 weight ");
	float person2=sc.nextFloat();

	System.out.println("enter the person's 3 weight ");
	float person3=sc.nextFloat();

	System.out.println("enter the person's 4 weight ");
	float person4=sc.nextFloat();
	
	System.out.println("enter the person's 5 weight ");
	float person5=sc.nextFloat();

	float totalweight=(person1+person2+person3+person4+person5)/5;
	int avg=(int)totalweight;

	System.out.println("the average weight of the person is "+avg);	
	}
}
