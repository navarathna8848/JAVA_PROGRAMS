class Coin

{
	public static void main(String[] args) 
	{
		int one=1;
		int two=2;
		int five=5;
		int one_rupee=5;
		int two_rupee=5;
		int five_rupee=5;

		int sum=one*one_rupee+two*two_rupee+five*five_rupee;

		int goal=23;

		if(goal<sum)
		{

            int a=goal/5;

            int a1=goal-(a*five);

            int b=a1/2;

            int b1=a1-(b*two);

            int c=b1/1;

            int c1=b1-(c*one);
            
            int total=a+b+c;

            System.out.println(total);
		}
		

		else
		{
			System.out.println("insufficient coins ");
		}

		

		
	}
}