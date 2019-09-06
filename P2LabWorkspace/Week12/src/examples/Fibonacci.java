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
public class Fibonacci {
    
    public static int fib(int n)
    {
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        return fib(n-1) + fib(n-2); 
    }

    public static int iterFib(int n)
    {
        if((n == 1)||(n==2))
                return 1;
        //start with sequence 1,1,2
        int pp = 1;//need to keep track of the previous
        int  p = 1; //two elements in the sequence to 
        int  f = 2; //compute the fib number

        for(int i=4;i<=n;i++) //for n>=4, compute the sequence
        {			
            pp = p;
            p = f;
            f = p + pp ;//compute the next fib number in the sequence
        }
        return f;
    }

    
    public static void main(String[] args)
    {   int N = 40;
        long begin = 0;
         begin = System.currentTimeMillis();
        System.out.println("RECURSIVE Fibonacci of N = "+N+" is "+fib(N));
        System.out.println("Time: "+(System.currentTimeMillis()-begin));
        
        begin = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci of N = "+N+" is "+iterFib(N));
        System.out.println("Time: "+(System.currentTimeMillis()-begin));
       
    }
}
