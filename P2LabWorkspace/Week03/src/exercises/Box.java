package exercises;

public class Box 
{
	private int height;
	private int width;
	private int depth;
	private boolean full;
	
	Box(int height, int width, int depth, boolean full)
	{
		setHeight(height);
		setWidth(width);
		setDepth(depth);
		setFull(full);
	}
	
	public void setHeight(int height)
	{
		if(height >= 0)
		{
			this.height = height;
		}
		else 
		{
			this.height = 0;
		}
	}
	public int getHeight()
	{
		return this.height;
	}
	
	public void setWidth(int width)
	{
		if(width >= 0)
		{
			this.width = width;
		}
		else 
		{
			this.width = 0;
		}
	}

	public int getWidth()
	{
		return this.width;
	}
	
	
	public void setDepth(int depth)
	{
		if(depth >= 0)
		{
			this.depth = depth;
		}
		else 
		{
			this.depth = 0;
		}
	}

	public int getDepth()
	{
		return this.depth;
	}
	
	public void setFull(boolean full)
	{
		this.full = full;
	}
	
	public boolean isFull()
	{
		return this.full;
	}
	
	public String toString()
	{
		String fullstat = "";
		
		if (this.isFull() == true)
		{ 
			fullstat = "Full";
		}
		else
		{
			fullstat = "Not Full";
		}
		
		return "The dimension of the Box is: Height: " + 
				this.height + ", Width: " + this.width + ", Depth: " + 
				this.depth + ", Full? " + fullstat;
	}
}
