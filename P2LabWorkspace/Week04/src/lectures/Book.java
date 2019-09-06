package lectures;

public class Book {
	
	private String title;
	private double price;
	private int numberOfPages;
	
	@Override
	public String toString()
	{
		return this.getTitle()+" $"+this.getPrice();
	}
	
	public Book(String title,double price,int numberOfPages)
	{
		this.setTitle(title);
		this.setPrice(price);
		this.setNumberOfPages(numberOfPages);
	}
	
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() 
	{
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) 
	{
		this.numberOfPages = numberOfPages;
	}
	
	
	

}
