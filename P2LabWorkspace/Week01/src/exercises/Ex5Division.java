package exercises;
import java.util.Scanner;

public class Ex5Division 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the numberator");
		int numerator = scanner.nextInt();
		
		System.out.println("Please enter the denominator");
		int denominator = scanner.nextInt();
		
		System.out.println("The input factor is: " + numerator + "/" + denominator);
		
		if (denominator == 0)
		{
			System.out.println("This quantity is undefined");
		}
		else 
		{
			float decimal_equivalence = (float)numerator/(float)denominator;
			
			System.out.println("The decimal equivalence is: " + decimal_equivalence);
		}
		
		scanner.close();
	}
}