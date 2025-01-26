import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value : ");
		int a=sc.nextInt();
		
		System.out.println("-------------------------------------------------");
		System.out.println("this the pattern ");

	  for(int i=1;i<=a;i++)//no.of.rows  for(int i=1;i<=a;i++)	
	  {
	  	for(int j=a;j>i;j--)///no.of.cols for(int j=1;j<=i;j++)	
	  
	  	{
	  	
	  			System.out.print(" ");
	  	}
	  	for (int k=1; k<=i; k++)
	  	{
         System.out.print("*");
       
        }
         System.out.println();
	  }
	}
}