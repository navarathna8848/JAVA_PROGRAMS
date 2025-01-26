import java.util.Scanner;
class ChallengePro
{
	public static int ChallengeAccepted(int num) 
	{
		while(num!=1 && num!=4)
		{
			int sum=0;
			while(num!=0)
			{
				int last = num % 10;
				sum = sum + (last * last);
				num=num /10;

			}
			num=sum;
			
		}
		return num; 


		
	}
	public static void main(String[] args) 
	{
  
            	Scanner sc=new Scanner(System.in);	
            	int num=sc.nextInt();
            	int res=ChallengeAccepted(num);

            	if (num==1)
			         System.out.println("yes these are happy numbers");
		        else
			         System.out.println("no these are not happy numbers");

	}
}