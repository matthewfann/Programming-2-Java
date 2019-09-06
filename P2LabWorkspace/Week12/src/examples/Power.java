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
public class Power {
    public static int NUM_MULTS = 0;
    public static double powerIterative(double a, int k)
    {   double total = 1.0;
        for (int i=1; i<=k; i++)
        {    total = total*a;
             NUM_MULTS++;
        }
        return total;
    }
    
    public static double power(double a, int k)
    { if (k == 1)
            return a;
        else
        {   int halfK = k/2;
            double aToHalfK = power(a, halfK);
            if (k%2 == 0) // k is even
            {   NUM_MULTS ++; 
                return aToHalfK * aToHalfK;
            }else // k is odd
            {   NUM_MULTS += 2;
                return aToHalfK * aToHalfK * a;
            }
        }
    }
    
    public static void main(String[] args)
    {   int K = 250;
        long begin = 0;
        NUM_MULTS = 0;
         begin = System.currentTimeMillis();
        System.out.println("ITERATIVE Power 2 to the  K = "+K+" is "+powerIterative(2,K));
        System.out.println("Time: "+(System.currentTimeMillis()-begin)+ " NUM MULTS is "+NUM_MULTS);
        NUM_MULTS = 0;
        begin = System.currentTimeMillis();
        System.out.println("RECURSIVE Power 2 of K = "+K+" is "+power(2,K));
        System.out.println("Time: "+(System.currentTimeMillis()-begin)+ " NUM MULTS is "+NUM_MULTS);
       
    }
}
