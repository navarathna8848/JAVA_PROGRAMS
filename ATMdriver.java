import java.util.Scanner; 
import java.util.Random;
class ATMdriver

{
	public static int GenerateOTP()
	{
		/*int min=1000;
		int max=10000;

		 int otp=(int)Math.random*(max-min)+min; max--->10000,min---->1000
		 return otp;  [or] */

		//random r=new Random();
		//r.nextInt(10000)+1000;  [or]

		Random r=new Random();
		int otp=r.nextInt(1000,10000);
		return otp;
	}
	
      public static void main(String[] args) 

      {

      	Scanner sc=new Scanner(System.in);
      	boolean b=true;
      	while(b)
      	{

        System.out.println("1.withdraw ");
        System.out.println("2.deposit");
        System.out.println("3.check balance");
        System.out.println("4.exit");
        int choice=sc.nextInt();


        switch(choice)
        {
        	case 1:
        	{
        		System.out.println("enter the amount ");
        		double amount=sc.nextDouble();
        		System.out.println();

                int generated_otp=GenerateOTP();
        		System.out.println("you otp is "+generated_otp);
        		int otp=sc.nextInt();
        		
        		if(otp==generated_otp)

        		      ATM.withdraw(amount);
                else
                	  System.out.println("invalid otp ");
        		break;
        	}

        	case 2:
        	{
        		System.out.println("enter the amount ");
        		double amount=sc.nextDouble();
        		ATM.deposit(amount);
        		break;
        	}
        	case 3:
        	{
        		
        	     ATM.Checkbalance();
        	     break;        		
        	}

        	case 4:
        	{
        		b=false;
        	}

        	default:
        	{
                System.out.println("invalid options");
        	}
          
          }

       }
       System.out.println("thank u!! ");

    }

}

