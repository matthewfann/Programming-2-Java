package examples;

import java.util.Stack;


public class BalancedBrackets {

	static public boolean balancedBrackets(char[] brackets){

		Stack<Character> stack = new Stack<Character>();
		for(char c : brackets){
			if((c == '[')||(c == '(')){
				stack.push(c);
			}else
				if(stack.isEmpty())
					return false;			
			if(c==']'){
				char top = stack.pop();
				if(top != '[') return false;

			}
			if(c==')'){
				char top = stack.pop();
				if(top != '(') return false;
			}
		}
		return stack.isEmpty();
	}


	public static void reverse(){
		int[] array = new int[]{3,2,1};
		Stack<Integer> stack = new Stack<Integer>();

		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);

		for(int i=0;i<array.length;i++)
			stack.push(array[i]);

		for(int i=0;i<array.length;i++)
			array[i]=stack.pop();

		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);

	}


	public static void main(String args[]){		
	}
}
