import java.util.Scanner;
import java.util.Arrays;
class EndZeroArray
{
	public static void main(String[] args) 
	{
	  
	 Scanner sc = new Scanner(java.lang.System.in);

	 java.lang.System.out.println("enter the size ");
	 int size = sc.nextInt();
	 int a[] = new int[size];
	

	 java.lang.System.out.println("enter the value ");

	 for(int i=0;i<a.length;i++)
	 {
	 	
	 	a[i]=sc.nextInt();

	 }
	
	int nonZeroIndex = 0;
       
        for (int i = 0; i < a.length; i++) 

        {
            if (a[i] != 0) {
                a[nonZeroIndex++] = a[i];
            }
        }
        while (nonZeroIndex < a.length) 
        {
            a[nonZeroIndex++] = 0;
        }

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(a));

	 	
	}
}
