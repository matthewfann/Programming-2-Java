package exercises;
import java.util.Scanner;

public class Ex3ThreeNumberAverage 
{
/**
 * 
 * @param args
 */
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Asking for the first number
		int FirstNumber;
		System.out.println("Enter the first number");
		//Scanning in the first number
		FirstNumber = scanner.nextInt();
		
		//Asking for the second number
		int SecondNumber;
		System.out.println("Enter the second number");
		//Scanning in the second number
		SecondNumber = scanner.nextInt();
		
		//Asking for the third number
		int ThirdNumber;
		System.out.println("Enter the third number");
		//Scanning in the third number
		ThirdNumber = scanner.nextInt();

		double AverageNumber = (FirstNumber + SecondNumber + ThirdNumber) / 3.0;
		
		//AverageNumber /= 3;
		
		System.out.println("\nThe Average of the numbers is:" + AverageNumber);
	
		scanner.close();
	}
}