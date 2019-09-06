package exercises;
import java.util.Scanner;

public class Ex8TimeDuration 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eter the number of hours");
		int hours = scanner.nextInt();
		
		System.out.println("Eter the number of minutes");
		int minutes = scanner.nextInt();
		
		System.out.println("Eter the number of seconds");
		int seconds = scanner.nextInt();
		
		System.out.print("\nThe total number of seconds is ");
		System.out.print(((hours * 3600) + (minutes * 60) + seconds) + ".");
	
		scanner.close();
	}

}
