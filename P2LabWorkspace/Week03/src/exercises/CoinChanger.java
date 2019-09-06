package exercises;

public class CoinChanger 
{
	private int ten;
	private int twenty;
	private int fifty;
	private int oneDollar;
	private int twoDollar;
	
	CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar)
	{
		setTen(ten);
		setTwenty(twenty);
		setFifty(fifty);
		setOneDollar(oneDollar);
		setTwoDollar(twoDollar);
	}
	
	public void setTen(int ten)
	{
		this.ten = ten;
	}
	
	public int getTen()
	{
		return this.ten;
	}
	
	public void setTwenty(int twenty)
	{
		this.twenty = twenty;
	}
	
	public int getTwenty()
	{
		return this.twenty;
	}
	
	public void setFifty(int fifty)
	{
		this.fifty = fifty;
	}
	
	public int getFifty()
	{
		return this.fifty;
	}
	
	public void setOneDollar(int oneDollar)
	{
		this.oneDollar = oneDollar;
	}
	
	public int getOneDollar()
	{
		return this.oneDollar;
	}
	
	public void setTwoDollar(int twoDollar)
	{
		this.twoDollar = twoDollar;
	}
	
	public int gettwoDollar()
	{
		return this.twoDollar;
	}
	
	public int computeChange()
	{
		return ((10 * this.ten) + (20 * this.twenty) + (50 * this.fifty) + (100 * this.oneDollar) + (200 * this.twoDollar));
	}
	
	public int dollars()
	{
		return (computeChange() / 100);
	}
	
	public int cents()
	{
		return (computeChange() % 100);
	}
	
	public String toString()
	{
		return this.ten + " of ten cents, " + this.twenty + " of twenty cents, " +
				this.fifty + " of fifty cents, " + this.oneDollar + " of one Dollar, " + 
				this.twoDollar + " of two Dollar.";
	}
	
}