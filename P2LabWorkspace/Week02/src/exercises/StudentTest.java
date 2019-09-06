package exercises;
import java.util.Scanner;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner student = new Scanner(System.in);
		
		System.out.println("Please enter student's firstname:");
		String firstname = student.nextLine();
		
		System.out.println("Please enter student's lastname:");
		String lastname = student.nextLine();
		
		System.out.println("Please enter student's ID:");
		String ID = student.nextLine();
				
		System.out.println("Calling 3 parameter constructor:");
		Student student1 = new Student(firstname,lastname,ID);		
		System.out.print("Student's first name: " + student1.firstname + " last name: " + student1.lastname + " ID: " + student1.studentID);
		
		System.out.println("Calling 2 parameter constructor:");
		student1 = new Student(firstname,lastname);
		System.out.println("Student's first name: " + student1.firstname + " last name: " + student1.lastname + " ID: " + student1.studentID);
		
		System.out.println("Calling zero parameter constructor:");		
		student1 = new Student();
		System.out.println("Student's first name: " + student1.firstname + " last name: " + student1.lastname + " ID: " + student1.studentID);
	
		student.close();
	}

}
