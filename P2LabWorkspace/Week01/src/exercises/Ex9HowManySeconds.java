package exercises;
import java.util.Scanner;

public class Ex9HowManySeconds 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds:");
		int seconds = scanner.nextInt();
		
		int minutes = seconds / 60;
		
		seconds %= 60;
		
		int hours = minutes / 60;
		
		minutes %= 60;
		
		System.out.println("\n" + seconds + " seconds is equivalent to");
		System.out.println(hours + " hours");
		System.out.println(minutes + " minutes");
		System.out.println(seconds + " seconds");
		
		scanner.close();
	}

}
