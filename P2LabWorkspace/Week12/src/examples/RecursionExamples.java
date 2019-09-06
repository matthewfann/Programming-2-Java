package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * This class contains static methods to compute
 * the factorial function and the Fibonacci sequence.
 * 
 *  The method compareFactorial performs an experiment comparing 
 *  the runtime speed of the recursive and iterative
 *  methods for computing the factorial function. 
 *  
 *  The method compareFibonacci performs an experiment comparing 
 *  the runtime speed of the recursive and iterative
 *  methods for computing the Fibonacci sequence. 
 * 
 * 
 * 
 * 
 * */

public class RecursionExamples {
	//------------------------------------------------------------------------
	public static double power(double a, int k)
	{
		if (k==0) 
		{
			return 1;
		}
		if (k == 1)
		{
			return a;
		}

		int halfK = k/2; //cut k in half.  
		double aToHalfK = power(a, halfK); //find power of a to halfK
		if (k%2 == 0) // k is even
			return aToHalfK * aToHalfK; 
		else // k is odd
			return aToHalfK * aToHalfK * a;
	}

	//------------------------------------------------------------------------
	public static void compareFibonacci()
	{
		for(int i=30;i<=50;i++)
		{
			long start= System.currentTimeMillis();			
			long v1 = fib(i);
			long stop= System.currentTimeMillis()-start;
			System.out.println("    fib("+i+") = "+v1+" took: "+stop+" ms");
			start= System.currentTimeMillis();
			long v2 = iterFib(i);						
			stop= System.currentTimeMillis()-start;
			System.out.println("iterFib("+i+") = "+v2+" took: "+stop+" ms");
		}
	}
	//------------------------------------------------------------------------
	static public void reverseArray(int[] array){

		Stack<Integer> aStack = new Stack<Integer>();

		for (Integer currentInteger : array)
		{ 
			aStack.push(currentInteger); 
		}

		for (int arrayIndex = 0;arrayIndex < array.length; ++arrayIndex)
		{ 
			array[arrayIndex] = aStack.pop(); 
		}

	}
	//------------------------------------------------------------------------

	public static void  compareFactorial()
	{
		for(int i=10;i<=39;i++)
		{
			long start= System.currentTimeMillis();			
			long v1 = fact(i);
			long stop= System.currentTimeMillis()-start;
			System.out.println("    fact("+i+") = "+v1+" took: "+stop+" ms");
			start= System.currentTimeMillis();
			long v2 = iterFact(i);						
			stop= System.currentTimeMillis()-start;
			System.out.println("iterFact("+i+") = "+v2+" took: "+stop+" ms");
		}
	}
	//------------------------------------------------------------------------
	/**
	 * recursive implementation of the factorial function
	 * @param n
	 * @return n!
	 * */
	public static long fact(long n){
		if (n == 0)
		{
			return 1;
		}

		return fact(n-1)*n;	
	}
	//------------------------------------------------------------------------
	/**
	 * iterative implementation of the factorial function
	 * @param n
	 * @return n!
	 * */
	public static long iterFact(long n){
		long product=1;
		for(long i=1;i<=n;i++)
		{
			product*=i;
		}

		return product;

	}
	//------------------------------------------------------------------------
	/**
	 * 
	 * Iterative implementation to compute the Fibonacci sequence
	 * @param n
	 * @return the nth number of the Fibonacci sequence
	 * 
	 * */
	public static long iterFib(long n){
		if((n == 1)||(n==2))
			return 1;

		//start with sequence 1,1,2
		long  p = 1;//need to keep track of the previous
		long pp = 1;//two elements in the sequence to 
		long  f = 2;//compute the fib number

		for(long i=4;i<=n;i++){//for n=4 compute the sequence
			pp = p;
			p = f;
			f = p + pp;//compute the next fib number in the sequence
		}
		return f;
	}
	//------------------------------------------------------------------------
	/**
	 * 
	 * Recursive implementation to compute the Fibonacci sequence
	 * @param n
	 * @return the nth number of the Fibonacci sequence
	 * 
	 * */
	public static long fib(long n){		
		if(n == 1)
			return 1;

		if(n == 2)
			return 1;

		return fib(n-1) + fib(n-2); 
	}
	static public ArrayList<Integer> inputIntegers(int n) throws InputMismatchException{

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int inputCount = 0; inputCount < n; ++inputCount)
		{

			aList.add(scan.nextInt()); 


		}
		Collections.sort(aList); 
		return aList;
	}
	//------------------------------------------------------------------------
	public static void main(String[] args) {

		try
		{
			inputIntegers(4);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e+" occured!");
		}
	}
}
