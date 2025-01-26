import java.util.Scanner;
import java.util.Arrays;
class Array
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];

	 System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }
	 System.out.println("----------------");

	/* String res="[";

	 for(int i=0;i<a.length;i++)
	 {
	 	if(i!=a.length-1)
	 		res=res+a[i]+",";
	 	else
	 		res=res+a[i];
	 	
	 }
       res=res+"]";
       System.out.println(res);*/

         System.out.println(Arrays.toString(a));
	}
}