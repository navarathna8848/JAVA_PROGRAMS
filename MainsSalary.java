import java.util.Scanner;
class Company
{
	private double base_salary;

	public Company(double base_salary)
	{
		this.base_salary=base_salary;
	}

	public double getSalary()
	{
		return base_salary;
	}

	public void setSalary(double base_salary)
	{
		this.base_salary=base_salary;
	}

	public double CalculateSalary()
	{
		return base_salary;


	}
}
class Employee extends Company
{
	int no_of_hrs_worked;

	public Employee(int no_of_hrs_worked,double base_salary)
	{
		super(base_salary);
		if(base_salary>0)
		{
		this.no_of_hrs_worked=no_of_hrs_worked;
        
	    }
	    else
	    {
	    	System.out.println("salary is not sufficient ");
	    }
	}

	@Override
	public double CalculateSalary()
	{
		double per_day_sal=getSalary()/30;
		double per_hour_sal=(per_day_sal/no_of_hrs_worked);
		double c=per_hour_sal*no_of_hrs_worked;
		return c;
	}

}
class Manager extends Company
{
	double bonus;

	public Manager(double bonus,double base_salary)
	{
		super(base_salary);
		this.bonus=bonus;
		
	}

	@Override
	public double CalculateSalary()
	{
		double mansal=getSalary()+bonus;
		return mansal;
	}
}
class MainsSalary
{
	public static void main(String[] args) 
	{
		/*Employee e=new Employee(10000,200000);
		double res=e.CalculateSalary();
		System.out.println(res);

		Manager m=new Manager(8,100000);
		double res1=m.CalculateSalary();
		System.out.println(res1);*/

		Scanner sc=new Scanner(System.in);

		boolean flag=true;

		while(flag)
		{

		System.out.println("-------------------------------------------");
		System.out.println("enter your choice ");
		int choice=sc.nextInt();
		System.out.println();

        switch(choice)
        {
        	case 1:
        	{
        		System.out.println("employee details ");
        		System.out.println();

        		System.out.println("enter the hours of working in a day ");
        		int no_of_hrs_worked=sc.nextInt();

        		System.out.println("enter the base salary ");
        		double base_salary=sc.nextDouble();

        		System.out.println("-------------------------------------------");


        		Employee e=new Employee(no_of_hrs_worked,base_salary);

		        double res=e.CalculateSalary();
		        System.out.println("the employee salary is "+res);
		        break;

        	}
        	case 2:
        	{
        		System.out.println("manager details ");
        		System.out.println();

        		System.out.println("enter the bonus ");
        		double bonus=sc.nextDouble();

        		System.out.println("enter the base salary  ");
        		double base_salary=sc.nextDouble();

        		System.out.println("-------------------------------------------");

        		Manager m=new Manager(base_salary,bonus);

	        	double res1=m.CalculateSalary();
		        System.out.println("the manager salary with bonus is "+res1);
		        break;

        	}
        	case 3:
        	{
        		flag=false;
        	    System.out.println("now exit and visit again !!!! thank u !!!");
        		break;

        	}
        	default:
        	{
        		System.out.println("invalid choice ");
        	}
        }

        }
		
	}
}