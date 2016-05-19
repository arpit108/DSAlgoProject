package com.ds.linear.stackqueue;

import java.util.Stack;

public class QueueUsingStack {

	
	private static Stack<Integer> s1;
	private static Stack<Integer> s2;
	
	
	
	public static void enQueue(Integer data)
	{
		
		if(s1==null)
		{
			s1=new Stack<>();
		}
		
		s1.push(data);
		
		
	}
	
	public static Integer deQueue()
	{
		Integer popValue=0;
		if(s2==null)
		{
			s2=new Stack<>();
		}
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		
		popValue=s2.pop();
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
		return popValue;
	}
	
	
	
	
	
	
	
}
