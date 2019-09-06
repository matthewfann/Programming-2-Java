package exercises;
import java.util.Scanner;

public class FareDiscountApp 
{
	public static int calculateDiscount(Person person)
	{
		if(person.age > 65)
		{
			return 100;
		}
		else if((person.student == true) && (person.age >= 10) && (person.age <= 20))
		{
			return 50;
		}
		else if((person.gender == 'F') && (person.gender > 40))
		{
			return 75;
		}
		else if((person.age % 2) == 0)
		{
			return 25;
		}
		else if((person.age % 2) == 1)
		{
			return 15;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Scanner person_scanner = new Scanner(System.in);
		
		System.out.println("Please emter the person's age:");
		person1.age = person_scanner.nextInt();
		
		System.out.println("Please enter the person's weight:");
		person1.weight = person_scanner.nextDouble();
		
		System.out.println("Is the person a student? (true/false)");
		person1.student = person_scanner.nextBoolean();
		
		System.out.println("Please enter the person's gender:");
		person1.gender = person_scanner.next().charAt(0);
		
		System.out.println("Person: age: " + person1.age + " weight: " + person1.weight + " student? " + person1.student + "gender: " + person1.gender);
		System.out.println("This person's discount is: " + calculateDiscount(person1) + "%");
		
		person_scanner.close();
	}
}
