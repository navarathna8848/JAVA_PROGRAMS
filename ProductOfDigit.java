//write a program to product of digits when the digit containing 0 value
import java.util.Scanner;
class ProductOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number you want to multiply ");
		int num=sc.nextInt();
		
		int product=1;
		 while(num!=0)//for(; num!=0 ;num/=10)
		 {	
		 	
		 	int last=num%10;
		 	if(last!=0)
		 	   product=product*last;

		 	num=num/10;//in for goes to updation block

		 }
		 System.out.println("the product is  " +product);
		

	}
	
}