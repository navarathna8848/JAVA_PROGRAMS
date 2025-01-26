import java.util.Scanner;
class Calc
{
      public static void calculate() 
        {
        	Scanner sc=new Scanner(System.in);

        	System.out.println("enter the a value ");
		    float a=sc.nextFloat();

		    System.out.println("enter the b value ");
		    float b=sc.nextFloat();

		    System.out.println("enter your choice:1.addition 2.subtraction 3.multiplication 4.division ");
		    int  choice=sc.nextInt();

		    switch(choice)

		    {
		    	case 1:
		    	System.out.println(" the add of two number is "+(a+b));
		    	break;

		    	case 2:
		    	System.out.println(" the sub of two number is "+(a-b));
		    	break;

		    	case 3:
		    	System.out.println(" the mul of two number is "+(a*b));
		    	break;

		    	case 4:
		    	System.out.println(" the div of two number is "+(a/b));
		    	break;	

		    }
		
	    }
	    public static void main(String[] args)
	        {
	    	System.out.println("Start the program ");
	    	System.out.println();
	    	calculate();
	    	System.out.println("End the program ");

	    	}	
}