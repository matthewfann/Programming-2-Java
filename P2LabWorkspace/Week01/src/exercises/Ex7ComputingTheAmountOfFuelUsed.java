package exercises;
import java.util.Scanner;

public class Ex7ComputingTheAmountOfFuelUsed 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of miles:");
		double miles = scanner.nextDouble();
		
		System.out.println("Enter the gallons of fuel used:");
		double fuel = scanner.nextDouble();
		
		System.out.println("\nMiles Per Gallon: " + (miles/fuel));
	
		scanner.close();
	}

}
