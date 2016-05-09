package com.ds.linear.linkedlist;

import java.util.Stack;

public class Operations {

	
	
	public static void iterate(Node node)
	{
		
		while(node!=null)
		{
			System.out.print(" "+node.data+"-->");
			node=node.next;
		}
	}
	
	
	
	public static Node insertFirst(Node node,int data)
	{
		
		Node head=new Node(data);
		
		if(node!=null)
		{
			head.next=node;
		}
		return head;
	}
	
	public static Node insertLast(Node node,int data)
	{
		
		Node n=new Node(data);
		
		Node head=node;
		if(head==null)
		{
			
			return n;
		}
		else
		{
			
			while(head.next!=null)
			{
				head=head.next;
			}
			
			head.next=n;
			
			return node;
		}
	}
	
	public static Node insertAtIndex(Node n,int index,int data) 
	{
		Node newNode=new Node(data);
		Node head=n;
		
		for(int i=0;i<index;i++)
		{
			if(head.next==null)
			{
				throw new IndexOutOfBoundsException();
			}
			head=head.next;
			
		}
		
		Node nextNode=head.next;
		head.next=newNode;
		newNode.next=nextNode;
		
		
		return n;
	}
	
	public static void reversePrint(Node n)
	{
		Stack<Integer> s=new Stack<Integer>();
		while(n!=null)
		{
			s.push(n.data);
			
			n=n.next;
		}
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop()+"-->");
		}
	}
	/*
	 * 
	 * Index of Linked List start with zero
	 * 
	 */
	
	public static Node deleteAtIndex(Node head,int index)
	{
		
		Node n=head;
		
		for(int i=1;i<index;i++)
		{
			if(n.next==null || n.next.next==null)
			{
				throw new IndexOutOfBoundsException("Index specified is greater then length of Linkedlist");
			}
			n=n.next;
		}
		
		Node nextNode=n.next.next;
		
		n.next=nextNode;
		
		return head;
	}
	
	
	
}
