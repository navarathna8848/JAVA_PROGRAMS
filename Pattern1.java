import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value : ");
		int a=sc.nextInt();
		System.out.println("enter the b value : ");
		int b=sc.nextInt();
		System.out.println("-------------------------------------------------");
		System.out.println("this the pattern ");

	  for(int i=a;i>=1;i--)//no.of.rows  for(int i=1;i<=a;i++)	
	  {
	  	for(int j=1;j<=i;j++)///no.of.cols for(int j=1;j<=i;j++)	
	  
	  	{
	  		System.out.print("* \t");
	  	}
	  	System.out.println();//to go to new line	
	  }
	}
}