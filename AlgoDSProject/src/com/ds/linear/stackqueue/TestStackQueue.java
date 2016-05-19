package com.ds.linear.stackqueue;


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
	
	
	
}
