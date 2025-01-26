class CountNo
{
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("enter the a no ");
		int a=sc.nextInt();

		System.out.println();

		System.out.println("enter the b no ");
		int b=sc.nextInt();

       int count=0;

	while(a<=b)//condition
	{
		if(a%3==0 && a%7==0)
		{
			System.out.println(a);
            count++;
        }

      a++;
	}	


     System.out.println("The count is "+count);
	}
}