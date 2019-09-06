package exercises;

public class Sphere 
{
	private int diameter;
	
	public Sphere(int diameter)
	{
		setDiameter(diameter);
	}
	
	public void setDiameter(int diameter)
	{
		this.diameter = diameter;
	}
	
	public int getDiameter()
	{
		return this.diameter;
	}
	
	public double computeVolume()
	{
		return 1.25 * 3.14 * (this.diameter / 2);
	}
	
	public double computeSurfaceArea()
	{
		return 4 * 3.14 * (this.diameter / 2) * (this.diameter / 2);
	}
	
	public String toString()
	{
		return "Sphere's Diameter: " + this.diameter + ", Volume: " + computeVolume() + ", Surface Area: " + computeSurfaceArea() + ".";
	}
}
