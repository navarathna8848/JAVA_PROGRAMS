import java.util.Scanner;
class Areas
{

	public static float areatri(float a,float b) 
	{
		float c=0.5f*a*b;
		return c;	
	}

	public static float areacir(float a) 
	{
		float c=3.14f*a*a;
		return c;	
	}

	public static float volcube(float a) 
	{
	    float c=a*a*a;
		return c;	
	}

	public static float volcuboid(float a,float b,float d) 
	{
	    float c=a*b*d;
		return c;	
	}

	public static float volcylinder(float a,float d) 
	{
		float c=0.3f*
		3.14f*a*a*d;
		return c;	
	}

	public static boolean vow(char vowel) 
	{
		if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='A' ||vowel=='E' ||vowel=='I' ||vowel=='O' ||vowel=='U')
		return true;

	    else
	    return false;
	}
	

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("1.area of triangle ");
	System.out.println("2.area of circle ");
	System.out.println("3.volume of cube ");
	System.out.println("4.volume of cuboid ");
	System.out.println("5.volume of cylinder ");
	System.out.println("6.check the vowel ");
	System.out.println("7.exit ");
	System.out.println("enter your choice ");
	int choice =sc.nextInt();

	boolean n=true;

	while(n)
	{
		switch(choice)
		{
          
	System.out.println("enter the a value");
	float a=sc.nextFloat();

	System.out.println("enter the b value");
	float b=sc.nextFloat();

	System.out.println("enter the d value");
	float d=sc.nextFloat();

	

	float c1=areatri(a,b);
	System.out.println("the area of triangle is "+c1);

	float c2=areacir(a);
	System.out.println("the area of circle is "+c2);

	float c3=volcube(a);
	System.out.println("the volume of cube is "+c3);

	float c4=volcuboid(a,b,d);
	System.out.println("the volume of cuboid is "+c4);

	float c5=volcylinder(a,d);
	System.out.println("the volume of cylinder is "+c5);

	System.out.println("enter the vowel ");
	char vowel=sc.next().charAt(0);

	boolean c6=vow(vowel);
	System.out.println("the letter is "+c6);
	

    
	}
}
		}
	}
