class Account
{
	long acc_no;
	String acc_holder_name;
	String ifsc;

	Account(){}

	Account(long acc_no,String acc_holder_name,	String ifsc)
	{
		this.acc_no=acc_no;
		this.acc_holder_name=acc_holder_name;
		this.ifsc=ifsc;
    }

    void display()
    {
    	System.out.println("the account holder is "+acc_holder_name);
    	System.out.println("the account number is "+acc_no);
    	System.out.println("the ifsc number is "+ifsc);
    }
}

class Bank
{
	Account a[]={new Account(312142l,"abc","321j"),new Account(2765423l,"xyz","4354y"),new Account(34785452l,"ghi","32fgj"),new Account(3342442l,"klm","334h21j"),new Account(34243576l,"nop","329d1j")};

    public  void Search(long acc_no)
    {
    	boolean bool=false;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i].acc_no==(acc_no))
    		{
    			bool=true;
    			a[i].display();
    			break;
    		}
    
    	}

    	if(bool==true)
  			System.out.println("the account number is matched ");
  		else
  			System.out.println("the account number is not matched ");
    }

    public  void Search(long acc_no,String acc_holder_name)
    {
    	boolean bool=false;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i].acc_no==(acc_no)  && a[i].acc_holder_name.equals(acc_holder_name))
    		{
    			bool=true;
    			a[i].display();
    			break;
    		}
    		
    	}
    	if(bool==true)
  			System.out.println("the account number and holder  is matched ");
  		else
  			System.out.println("the account number and holder  is not matched ");


    }

    public  void Search(String acc_holder_name)
    {
    	boolean bool=false;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i].acc_holder_name.equals(acc_holder_name))
    		{
    			bool=true;
    			a[i].display();
    			break;
    		}
    		
    	}
    	if(bool==true)
  			System.out.println("the account holder  is matched ");
  		else
  			System.out.println("the account holder  is not matched ");
    	   
  	
    }
    public  void Search(long acc_no,String acc_holder_name,String ifsc)
    {
    	boolean bool=false;
    	for(int i=0;i<a.length;i++)
    	{
    		
    		if(a[i].acc_holder_name.equals(acc_holder_name) && a[i].acc_no==acc_no && a[i].ifsc.equals(ifsc))
    		{
    			bool=true;
    			a[i].display();
    			break;
    		}
        }

        if(bool==true)
  			System.out.println("the account number , holder and ifsc  is matched ");
  		else
  			System.out.println("the account number , holder and ifsc is not matched ");

    	
    }

}
class BanksMains
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();

		b.Search(312142l);
		System.out.println("------------------------------------");
		b.Search("xz");
		System.out.println("------------------------------------");
		b.Search(312142l,"abc","321j");
	}
}