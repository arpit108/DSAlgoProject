package com.ds.linear.stackqueue;

import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> s) {

		Stack<Integer> r = new Stack<>();

		while (!s.isEmpty()) {

			int temp = s.pop();
			while (!r.isEmpty() && temp < r.peek()) {

				s.push(r.pop());

			}
			r.push(temp);

		}

		return r;
	}

	
	public static void printStack(Stack s)
	{
		
		while(!s.isEmpty())
		{
			
			System.out.print(s.pop() +"<--");
		}
	}
	
	
}
