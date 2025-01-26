import java.util.Scanner;
class LaptopMain
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		Laptop[] l=new Laptop[size];

		for(int i=0;i<l.length;i++)
		{
			
            System.out.println("enter the " +(i+1)+ " data");
            System.out.println();

			System.out.println("enter the brand :");
			String brand=sc.next();

			System.out.println("enter the model :");
			int model=sc.nextInt();

			System.out.println("enter the price :");
			double price=sc.nextDouble();

			System.out.println("enter the RAM :");
			int ram=sc.nextInt();

			System.out.println("-----------------------------------------------------------");

			l[i]=new Laptop(brand,model,price,ram);  //Laptop l1=new Laptop(brand,model,price,ram);  l[i]=l;
          

           }
            
            for(int i=0;i<l.length;i++)
            {
            	l[i].Display();
            	System.out.println("-----------------------------------------------------------");

            }



		}


		/* Laptop l1=new Laptop();
		l1.Display();
		System.out.println("----------------------------------");

		Laptop l2=new Laptop("lenovo");
		l2.Display();
		System.out.println("----------------------------------");

		Laptop l3=new Laptop("dell",100);
		l3.Display();
		System.out.println("----------------------------------");

		Laptop l4=new Laptop("HP",101,80000.12);
		l4.Display();
		System.out.println("----------------------------------");

		Laptop l5=new Laptop("lenovo",102,50000.566,8);
		l5.Display();
		System.out.println("----------------------------------"); */


	}
