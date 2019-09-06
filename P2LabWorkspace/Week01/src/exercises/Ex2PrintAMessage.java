package exercises;
import java.util.Scanner;

public class Ex2PrintAMessage 
{
	/**
	* Comment written here
	* 
	* */
	public static void main(String[] args) 
	{
		//the following line creates a new scanner, to take in the user input
		Scanner scanner = new Scanner (System.in);
		//Then ask the user for the input
		System.out.println("What is the message?");
		
		String input = scanner.nextLine();
		System.out.println("\nThe message is \"" + input + "\".");
		
		scanner.close();
	}
}