import java .util.Scanner;
class Coin1

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

            System.out.println("enter the one rupee :");
		int one=sc.nextInt();

		System.out.println("enter the two rupee :");
		int two=sc.nextInt();

		System.out.println("enter the five rupee :");
		int five=sc.nextInt();

		System.out.println("enter the number of one rupee coin you have :");
		int one_rupee=sc.nextInt();

		System.out.println("enter the number of two rupee coin you have :");
		int two_rupee=sc.nextInt();

		System.out.println("enter the number of five rupee coin you have :");
		int five_rupee=sc.nextInt();

		
		int sum=one*one_rupee+two*two_rupee+five*five_rupee;
            System.out.println("the sum is :"+sum);

            System.out.println("enter the goal :");
            int goal=sc.nextInt();


		if(goal<=sum)
		{

            int a=goal/five;
            int a1=0;

            if(a<=five_rupee)
            {
            	a1=goal-(a*five);
                
            }
            else
            {
            	a=five_rupee;
            	a1=goal-(a*five);
                
            }

            System.out.println("the total five rupee coins required is :"+a);

            int b=a1/two;
            int b1=0;

            if(b<=two_rupee)
            {
            	b1=a1-(b*two); 
                
            }
            else
            {
            	b=two_rupee;
            	b1=a1-(b*two);
                
            }

            System.out.println("the total two rupee coins required is : "+b);

            int c=b1/one;
            int c1=0;
            
            if (c<=one_rupee)
             {
                  c1=b1-(c*one);
                
             }

            else
             {
                  c=one_rupee;
                  c1=b1-(c*one);

             }
            System.out.println("The total one rupee coins required is: " + c);

           
            int total=a+b+c;

            System.out.println("the total coin required is "+total);
		}
		

		else
		{
			System.out.println("insufficient coins ");
		}

		

		
	}
}