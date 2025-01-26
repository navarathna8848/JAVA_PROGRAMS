class ExStatic
{
	static int a=10;
	static int b;

	static
	{
        b=10;
       
	}

	public static void main(String[] args)
	 {
		System.out.println(b);
		System.out.println(a);
	 }


}