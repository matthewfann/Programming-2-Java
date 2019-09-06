package exercises;
import java.util.Scanner;

public class Ex6ConvetMilesToKMs 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of miles:");
		float no_of_miles = scanner.nextFloat();
		
		if(no_of_miles < 0) 
		{
			System.out.println("Please enter a value greater than 0!");
		}
		else 
		{
			System.out.println("The number of kms is:" + (no_of_miles * 1.60935));
		}
		
		scanner.close();
	}

}
