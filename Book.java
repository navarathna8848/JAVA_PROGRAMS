class Book
{
	

	String book_name;
	int book_id;
	String book_author;
	double book_price;

       public Book(String book_name,int book_id,String book_author,double book_price)
       {

       this.book_name=book_name;
       this.book_id=book_id;
       this.book_author=book_author;
       this.book_price=book_price;

       }

	public  void BookDetails() 
	{
		System.out.println("the book name is :"+book_name);
		System.out.println("the book id is :"+book_id);
		System.out.println("the author of the book  is :"+book_author);
		System.out.println("the book price is :"+book_price);
		
		
	}
}
