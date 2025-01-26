/*write a java program to calculate total salary of an employee for the given details
hours of working ,hours rate display the total salary as a double format ,
display the total salary as an integer also */

import java.util.Scanner;
class HoursWorked
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hours of working ");
		int hours_worked=sc.nextInt();

		System.out.println("enter the rate based on your work ");
		float hours_rate=sc.nextFloat();

		int total_salary1=hours_worked*(int)hours_rate;
		System.out.println("the total salary in integer format "+total_salary1);

		double total_salary2=hours_worked*hours_rate;
		System.out.println("the total salary in double format "+total_salary2);

	}
}
