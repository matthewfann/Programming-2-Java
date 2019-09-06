package exercises;

public class Student 
{
	private String firstname;
	private String lastname;
	private String student_ID;
	
	//if the user press "enter" when they are suppose to key in
	//their name, how to detect that?
	
	public Student(String fn, String ln, String ID)
	{	
		this.setID(ID);
		this.setFirstname(fn);
		this.setLastname(ln);
	}
	
	public Student(String ID)
	{
		this("", "", ID);
	}
	
	public void setID(String ID)
	{
		this.student_ID = ID;
	}
	
	public void setFirstname(String fn)
	{
		this.firstname = fn;
	}
	
	public void setLastname(String ln)
	{
		this.lastname = ln;
	}
	
	public String getID()
	{
		return this.student_ID;
	}
	
	public String getFirstname()
	{
		return this.firstname;
	}
	
	public String getLastname()
	{
		return this.lastname;
	}
	
	public String toString()
	{
		return "Student's first name: " + this.firstname
				+ ", last name: " + this.lastname + 
				", ID: " + this.student_ID;
	}
}
