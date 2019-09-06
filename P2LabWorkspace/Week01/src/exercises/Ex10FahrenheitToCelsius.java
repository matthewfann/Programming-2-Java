package exercises;
import java.util.Scanner;

public class Ex10FahrenheitToCelsius 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature in Fahrenheit:");
		int Fahrenheit = scanner.nextInt();
		System.out.println("The temperature " + Fahrenheit + "F is " + (int)(Fahrenheit/2.12) + "C");
		
		scanner.close();
	}
}
