package examples;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(2);
		System.out.println("push(2): "+stack);
		stack.push(8);
		System.out.println("push(8): "+stack);
		int top = stack.peek();	
		System.out.println("peek: "+stack);
		System.out.println("peek returned: "+top);
		stack.pop();
		System.out.println("pop(): "+stack);
		stack.push(10);
		System.out.println("push(10): "+stack);
		stack.push(6);
		System.out.println("push(6): "+stack);
	}

}
