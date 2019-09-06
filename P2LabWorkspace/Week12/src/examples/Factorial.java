/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author sehall
 */
public class Factorial {
    
    //iterative approach
    public static long factorialIterative(long n)
    { 	long total = 1;
	for (long i=1; i<=n; i++)
		total = total*i;   
	return total;
    }   
    //factorial using recursion, calls itself
    public static long factorial(long n)
    { 	if(n == 1)
            return 1;
	else
            return factorial(n-1)*n;
    }

    public static void main(String[] args)
    {   int N = 20;
        long begin = 0;
         begin = System.currentTimeMillis();
        System.out.println("RECURSIVE factorial of N = "+N+" is "+factorial(N));
        System.out.println("Time: "+(System.currentTimeMillis()-begin));
        begin = System.currentTimeMillis();
        System.out.println("Iterative factorial of N = "+N+" is "+factorialIterative(N));
        System.out.println("Time: "+(System.currentTimeMillis()-begin));
       
    }
    
}
