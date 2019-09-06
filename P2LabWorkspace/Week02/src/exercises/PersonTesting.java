package exercises;
import java.util.Scanner;

public class PersonTesting 
{
	public static void main(String args[])
	{
		Scanner person_scanner = new Scanner(System.in);
		
		System.out.println("Please enter the person's age:");
		int age = person_scanner.nextInt();
		
		System.out.println("Please enter the person's weight:");
		double weight = person_scanner.nextDouble();
		
		System.out.println("Is the person a student(true/false):");
		Boolean student = person_scanner.nextBoolean();
		
		System.out.println("Please enter the person's gender(M/F):");
		char gender = person_scanner.next().charAt(0);
		
		Person person1 = new Person(age, weight, student, gender);
		
		System.out.println("Person: age: " + person1.age + " weight: " + person1.weight + " student?: " + person1.student + " gender: " + person1.gender);
	
		person_scanner.close();
	}
}
