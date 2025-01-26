import java.util.Scanner;
class HarshadNumber
{

	public static void main(String[] args) 
	{
        System.out.println("enter the number you want ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
	    int sum=0;
	    int temp=num;
		     
             
		 while(num>0)

		    {                                                                 
		 	 int last = num%10;
		       sum=sum+last;		       
		 	   num = num / 10;
		 	}


	        if(temp%sum==0)

	        	 	System.out.println("the number is harshad number");
	        else
	        	    System.out.println("the number is not a harshad number");


        }
    }

	
