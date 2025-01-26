import java.util.Scanner;
class BookMain
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the book name ");
		String book_name=sc.nextLine();

		System.out.println("enter the book id ");
	    int book_id=sc.nextInt();

	    System.out.println("enter the book author ");
	    String book_author=sc.next();

        System.out.println("enter the book price ");
	    double book_price=sc.nextDouble();

	    System.out.println("******************************************");


	    System.out.println();


	  
		
		Book b1=new Book(book_name,book_id,book_author,book_price);
        b1.BookDetails();


        System.out.println("*******************************************");


	    System.out.println("enter the book name ");
		String book_name1=sc.nextLine();

		sc.nextLine();

		System.out.println("enter the book id ");
	    int book_id1=sc.nextInt();

	    System.out.println("enter the book author ");
	    String book_author1=sc.next();

        System.out.println("enter the book price ");
	    double book_price1=sc.nextDouble();


	    System.out.println();

	    System.out.println("*******************************************");

        
		Book b2=new Book(book_name1,book_id1,book_author1,book_price1);
        b2.BookDetails();

	}
}