package exercises;

public class ANXbank 
{
	public static void main(String[] args) 
	{	
		BankAccount person1 = new BankAccount();
		
		person1.name = "Haseeb Cheema";
		person1.accountcode = "123456789";
		
		BankAccount person2 = new BankAccount();
		
		person2.name = "Steffan Hooper";
		person2.accountcode = "796658";
		
		BankAccount person3 = new BankAccount();
		
		person3.name = "Koz Ross";
		person3.accountcode = "111";
		
		BankAccount person4 = new BankAccount();
		
		person4.name = "Kerry Newton";
		person4.accountcode = "321321";
		
		System.out.println("Name: " + person1.name +" Code: " + person1.accountcode);
		System.out.println("Name: " + person2.name +" Code: " + person2.accountcode);
		System.out.println("Name: " + person3.name +" Code: " + person3.accountcode);
		System.out.println("Name: " + person4.name +" Code: " + person4.accountcode);
	}
}
