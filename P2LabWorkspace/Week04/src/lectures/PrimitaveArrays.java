package lectures;

public class PrimitaveArrays {

	
	public static int count(int[] numbers,int x)
	{
		
		int counter=0;
		
		for(int n : numbers)
		{
			if(n == x)
			{
				counter++;		
			}
			
		}
		return counter;
	}
	
	public static void main(String[] args) 
	{
		int[] numbers = new int[4];
		
		int[][] twoDimArray = new int[3][4];
		
		
		numbers[0] = 5;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 5;
		
		int count = count(numbers,5);
		System.out.println(count);
	}

}
