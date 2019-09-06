package examples;

import java.util.Stack;

public class MaxMinStack {
	private Stack<Integer> stack;	
	private Stack<Integer> maxStack;
	private Stack<Integer> minStack;

	//--------------------------------------------------------
	private Integer top(Stack<Integer> s){
		Integer top =  s.pop();
		s.push(top);
		return top;
	}
	//--------------------------------------------------------
	public MaxMinStack(){
		this.stack = new Stack<Integer>();
		this.maxStack = new Stack<Integer>();
		this.minStack = new Stack<Integer>();
	}
	//--------------------------------------------------------
	public Integer getMax(){		
		return this.top(maxStack);
	}
	//--------------------------------------------------------
	public Integer getMin(){
		return this.top(minStack);
	}
	//--------------------------------------------------------
	public void push(Integer item){

		this.stack.push(item);

		if(this.minStack.empty()) 
			minStack.push(item);else
				if (getMin() > item)
					minStack.push(item);

		if(this.maxStack.empty())		
			maxStack.push(item);else
				if (getMax() < item)
					maxStack.push(item);
		
	}
	//--------------------------------------------------------
	public Integer pop(){
		
		Integer x = this.stack.pop();
		if(this.getMax().equals(x))
			this.maxStack.pop();
		
		if(this.getMin().equals(x))
			this.minStack.pop();
		
		return x;
	}
	//--------------------------------------------------------
	public static void main(String[] args) {
		MaxMinStack stack = new MaxMinStack();
		stack.push(5);
		stack.push(10);
		stack.push(2);
		System.out.println(stack.getMax());
		stack.push(1);
		System.out.println(stack.getMax());
		stack.push(0);
		System.out.println(stack.getMax());
		stack.pop();stack.pop();stack.pop();stack.pop();
		System.out.println(stack.getMax());

	}
	//--------------------------------------------------------
}
