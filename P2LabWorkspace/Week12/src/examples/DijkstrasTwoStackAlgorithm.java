package examples;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Implementation of Dijkstra's Two-Stack Algorithm from the textbook 
 * Algorithms Fourth Edition, Sedgewick and Wayne 
 * Addison Wesley, 2011
 * Page 129
 * 
 * */



public class DijkstrasTwoStackAlgorithm {


	public static ArrayList<String> tokens(String input)
	{
		StreamTokenizer st = new StreamTokenizer(new StringReader(input));
		ArrayList<String> tokens = new  ArrayList<String>();
		st.ordinaryChar('+');
		st.ordinaryChar('/');
		st.ordinaryChar('*');
		st.ordinaryChar('-');
		st.lowerCaseMode(true);
		st.parseNumbers();

		try {
			while((st.nextToken()) != StreamTokenizer.TT_EOF)
			{

				if(st.ttype == StreamTokenizer.TT_NUMBER)
				{
					tokens.add(new Double(st.nval).toString());
				}
				else
					if(st.ttype == StreamTokenizer.TT_WORD)
					{
						tokens.add(st.sval);
					}

					else
					{
						char ch = (char) st.ttype;
						tokens.add(ch+"");
					}

			}
		} catch (IOException e) {e.printStackTrace();}
		return tokens;
	}


	static public double evaluate(String expression)
	{
		double result = -1;
		ArrayList<String> tokens = tokens(expression);
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		for(String token : tokens)
		{
			if (token.equals("("));//do nothing;
			else if (token.equals("+")) ops.push(token);
			else if (token.equals("-")) ops.push(token);
			else if (token.equals("*")) ops.push(token);
			else if (token.equals("/")) ops.push(token);
			else if (token.equals("sqrt")) ops.push(token);
			else if (token.equals(")"))
			{
				String op = ops.pop();
				double v = vals.pop();
				if(op.equals("+")) v = vals.pop() + v;
				else if(op.equals("-")) v = vals.pop() - v;
				else if(op.equals("*")) v = vals.pop() * v;
				else if(op.equals("/")) v = vals.pop() / v;
				else if(op.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}//token is not a bracket or an operator... it's number
			else vals.push(Double.parseDouble(token));					
		}
		result = vals.pop();

		return result;
	}

	public static void main(String[] args) 
	{	
		System.out.println(evaluate("(-12 - 1)"));
		System.out.println(evaluate("(3 * (2*4))"));
		System.out.println(evaluate("((1/2) * (2*(2+3)))"));
		System.out.println(evaluate("((sqrt  4 )*(2+1)  )"));
		System.out.println(evaluate("(1+((2+3)*(4*5)))"));

	}

}
