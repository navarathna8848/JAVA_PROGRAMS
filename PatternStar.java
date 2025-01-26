import java.util.Scanner;
class PatternStar
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value : ");
		int a=sc.nextInt();
		
		System.out.println("-------------------------------------------------");
		System.out.println("this the pattern ");

	  for(int i=1;i<=a;i++)

	  	for(int j=1;j<2*a-1;j++)
	  
	  	{
	  		if(i==j && i+j>=2*a)
	  	
	  			System.out.print("*");
	  		else
	  			System.out.println(" ");
	  	}
	  	
        
         System.out.println();
	  }
	
}