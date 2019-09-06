package lectures;

public class BookStore {

	private Book[] books;
	private int nextAvailableIndex;





	@Override
	public String toString()
	{
		return this.books + " :  "+this.nextAvailableIndex; 
	}
	public BookStore(int capacity)
	{
		this.books = new Book[capacity];
		this.nextAvailableIndex=0;

	}
	/**
	 * Adds a Book object to the next available
	 * location in the book array.
	 * @parm a book object
	 * */
	public void addBook(Book aBook)
	{
		if(!(this.nextAvailableIndex>= this.books.length))
		{
			this.books[this.nextAvailableIndex] = aBook;
			this.nextAvailableIndex++;
		}
		else
		{
			System.out.println("Capacity has been exceeded");
		}

	}

	public static void main(String[] args) 
	{
		Book b1 = new Book("Title1",1.99,100);
		Book b2 = new Book("Title2",2.99,200);
		Book b3 = new Book("Title3",3.99,100);
		Book b4 = new Book("Title4",4.99,100);

		BookStore store = new BookStore(3);
		store.addBook(b1);
		//store.setNextAvailableIndex(-10);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);

	}











}
