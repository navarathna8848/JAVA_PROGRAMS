//write a program to check whether number is palindrome
class Palindrome
{
	public static void main(String[] args)
    {
    	System.out.println("enter the number you want ");
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	
    	int rev=0;

    	while(num>0)
    	{
    		int last =num%10;
    		rev=(rev*10)+last;
    		num=num/10;
    	}
		System.out.println("The reverse of the number is "+rev);
		if(rev==num)
			System.out.println("the number is palindrome ");
		else
			System.out.println("the number is not palindrome ");
	}
}