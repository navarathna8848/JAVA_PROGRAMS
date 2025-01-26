import java.util.Scanner;
abstract class RBI
{
	abstract public double ROI();
}
class SBI extends RBI
{
	Scanner sc =new Scanner(System.in);
	
	@Override
	public double ROI()
	{
		int si=sc.nextInt();
	    int p=sc.nextInt();
	    int n=sc.nextInt();

		double r=(si*100)/(p*n);
		return r;

	}
}
class AXIS extends RBI
{
	Scanner sc =new Scanner(System.in);
	
	
	@Override
	public double ROI()
	{
		int si1=sc.nextInt();
	    int p1=sc.nextInt();
	    int n1=sc.nextInt();
		double r=(si1*100)/(p1*n1);
		return r;

	}
}

class BankRbi
{
	public static void main(String[] args) 
	{
		RBI r;

		r=new AXIS();


		System.out.println(r.ROI());


		
	}
}