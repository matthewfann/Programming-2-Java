package exercises;

public class NitFluxAccount 
{
	String email;
	int length_of_subscription;
	float bill_per_month;
	
	BankAccount bankinfo;
	
	float computeCustomerPay(int month, float bill)
	{
		return month * bill;
	}
}
