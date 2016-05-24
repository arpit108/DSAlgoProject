package com.ds.linear.stackqueue;


import java.util.Stack;

import org.junit.Test;

public class TestStackQueue {

	
	@Test
	public void testQueueUsingStack()
	{
		for(int i=1;i<=10;i++)
		QueueUsingStack.enQueue(i); 
		
		System.out.println(QueueUsingStack.deQueue());
		
		QueueUsingStack.enQueue(11); 
		
		System.out.println(QueueUsingStack.deQueue());
		System.out.println(QueueUsingStack.deQueue());
	}
	
	
	@Test
	public void testSort()
	{
		Stack<Integer> s=new Stack<>();
		
		s.push(20);
		
		s.push(11);
		
		s.push(21);
		
		s.push(51);
		
		Stack r=SortStack.sortStack(s);
		
		SortStack.printStack(r);
	}
}
