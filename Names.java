import java.util.Scanner;
class Names
{
	
	public static void main(String[] args)
	
	 {
		Scanner a=new Scanner(System.in);

		System.out.println("enter ur name:");
		String my_name=a.next();
		
		a.nextLine();


		System.out.println("enter ur friend name:");
		String friend_name=a.nextLine();
 
			System.out.println("My name is " +my_name+ " And My friend name is " +friend_name);
	}
}