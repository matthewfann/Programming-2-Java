package exercises;
import java.util.Scanner;

public class CoinChangerApplication 
{
	public static void main(String[] args) 
	{
		Scanner coinScanner = new Scanner(System.in);
		
		char playagain = 'y';
		
		while(playagain == 'y' || playagain == 'Y')
		{
			System.out.println("Welcome to the Coin Changer Machine. Please input you coins:");
			System.out.println("number of 10c coins:");
			int ten = coinScanner.nextInt();
			
			System.out.println("number of 20c coins:");
			int twenty = coinScanner.nextInt();
			
			System.out.println("number of 50c coins:");
			int fifty = coinScanner.nextInt();
			
			System.out.println("number of dollar coins:");
			int oneDollar = coinScanner.nextInt();
			
			System.out.println("number of two dollar coins:");
			int twoDollar = coinScanner.nextInt();
			
			CoinChanger CoinChanger1 = new CoinChanger(ten, twenty, fifty, oneDollar, twoDollar);
			System.out.println("The total value of the coin collection is: $" + CoinChanger1.dollars() + "." + CoinChanger1.cents());
			
			System.out.println("Woule you like to continue?");
			playagain = coinScanner.next().charAt(0);
		}
		
		coinScanner.close();
	}

}
