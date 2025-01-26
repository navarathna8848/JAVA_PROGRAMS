import java.util.Scanner;
class NoParameterized
{
	public static String nava() 

	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string a ");
		String a=sc.next();

		System.out.println("enter the string b ");
		String b=sc.next();

		String c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		
		
		String c=nava();
		System.out.println(c);

	}
}