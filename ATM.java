
public class ATM
{

  static double balance =1000.80; 
  
	public static void withdraw(double amount) 
	{
		if(amount<=0)
		{
			System.out.println("invalid amount !!");
		}
		else
		{
			if(amount%500==0 && amount<balance)
			{
				System.out.println("amount is withdrawal successfuly ...");
				balance=balance-amount;
				System.out.println("the updated balance is "+balance);

			}
			else
			{
				System.out.println("the amount is not multiple of 500");
			}
		}
		
	}

	public static void deposit(double amount) 
	{
		

			if(amount>0 && amount<40000)
			{
				System.out.println("amount is deposited successfuly ...");
				balance=balance+amount;
				System.out.println("the updated balance is "+balance);

			}
			else
			{
				System.out.println("the amount enter is not correct");
			}
		
	}

	public static void Checkbalance() 
	{
		
		System.out.println("the checkbalance "+balance);
	}
  
   
}