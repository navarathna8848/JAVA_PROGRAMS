import java.util.Scanner;
class PatternZoho
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value : ");
		String a=sc.next();
		
		System.out.println("-------------------------------------------------");
		System.out.println("this the pattern ");

		if (a.length()%2==0) 
		{
			System.out.println("please enter thge odd number of strings:  ");
		}
		else
		{
		   for(int i=0;i<=a.length();i++)
			 {

	  	     for(int j=0;j<a.length();j++)
	  
	  	       {
	  		      if(i==j || i+j==a.length()-1)
	  	
	  			        System.out.print(a.charAt(j)+" ");
	  		      else
	  		
	  		          	System.out.print("  ");

	  		          
	  	        }
	  	       System.out.println();	      
              }

        }
                
	        
	   
	   	}
	 	
}