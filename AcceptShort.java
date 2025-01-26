import java.util.Scanner;
class AcceptShort
{
	public static void ShortValue(short a) 
	{
	System.out.println(a);	
	}

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a value");
	short a=sc.nextShort();
	
	ShortValue(a);
	}
}