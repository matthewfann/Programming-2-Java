package exercises;

public class Student 
{
	String firstname;
	String lastname;
	String studentID;
	
	//The constructor for the Student Class takes in first name, last name, and ID
	Student(String fn, String ln, String ID)
	{
		this.firstname = fn;
		this.lastname = ln;
		this.studentID = ID;
	}
	
	//the constructor which takes in only first name and last name
	Student(String fn, String ln)
	{
		this.firstname = fn;
		this.lastname = ln;
		this.studentID = "?";
	}
	
	//the default constructor which sets the default value if nothing has been input when calling the constructor
	Student()
	{
		this.firstname = "UNKNOWN";
		this.lastname = "UNKNOWN";
		this.studentID = "?";
	}
	
}
