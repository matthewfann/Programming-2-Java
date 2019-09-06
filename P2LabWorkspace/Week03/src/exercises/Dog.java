package exercises;

public class Dog 
{
	private String name;
	private int age;
	
	public Dog(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	
	public void setAge(int age)
	{
		if(age > 0)
		{
			this.age = age;
		}
		else
		{
			this.age = 0;
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int computeAge(int age)
	{
		return age * 7;
	}
	
	public String toString()
	{
		return "Dog name: " + this.name + ", Dog age: " + this.age + ", In person's age: " + computeAge(this.age);
	}
}
