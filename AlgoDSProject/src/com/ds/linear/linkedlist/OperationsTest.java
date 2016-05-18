package com.ds.linear.linkedlist;

import org.junit.Test;

public class OperationsTest {

	@Test
	public void testInsertFirst() {

		Node head = Operations.insertFirst(null, 1);
		Operations.iterate(head);

	}

	@Test
	public void testInsertLast() {
		Node head = Operations.insertFirst(null, 4);

		head = Operations.insertFirst(head, 3);
		head = Operations.insertFirst(head, 2);
		head = Operations.insertFirst(head, 1);

		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");

		Node last = Operations.insertLast(head, 5);

		Operations.iterate(last);

	}

	@Test
	public void testInsertAtIndex() {

		Node head = Operations.insertFirst(null, 5);

		head = Operations.insertFirst(head, 3);
		head = Operations.insertFirst(head, 2);
		head = Operations.insertFirst(head, 1);

		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");

		head = Operations.insertAtIndex(head, 2, 4);
		Operations.iterate(head);
	}

	@Test
	public void testReversePrint() {
		Node head = Operations.insertFirst(null, 4);

		head = Operations.insertFirst(head, 3);
		head = Operations.insertFirst(head, 2);
		head = Operations.insertFirst(head, 1);

		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");

		Operations.reversePrint(head);

	}

	@Test
	public void testDeleteAtIndex() throws Exception {
		Node head = Operations.insertFirst(null, 4);

		head = Operations.insertFirst(head, 3);
		head = Operations.insertFirst(head, 2);
		head = Operations.insertFirst(head, 1);

		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");

		head = Operations.deleteAtIndex(head, 2);

		Operations.iterate(head);

	}
	
	@Test
	public void testReverse()
	{
		Node head = Operations.insertFirst(null, 4);

		head = Operations.insertFirst(head, 3);
		head = Operations.insertFirst(head, 2);
		head = Operations.insertFirst(head, 1);
		
		
		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");
		
		head=Operations.reverse(head);
		
		
		Operations.iterate(head);
		System.out.println();
		System.out.println("-----");
	}
	

	@Test
	public void testMergeLL()
	{
		Node head1 = Operations.insertFirst(null, 11);

		head1 = Operations.insertFirst(head1, 10);
		head1 = Operations.insertFirst(head1, 7);
		head1 = Operations.insertFirst(head1, 5);
		head1 = Operations.insertFirst(head1, 1);
		
		Operations.iterate(head1);
		System.out.println();
		System.out.println("-----");
		
		Node head2 = Operations.insertFirst(null, 20);

		head2 = Operations.insertFirst(head2, 17);
		head2 = Operations.insertFirst(head2, 15);
		head2 = Operations.insertFirst(head2, 12);
		head2 = Operations.insertFirst(head2, 2);
		
		Operations.iterate(head2);
		System.out.println();
		System.out.println("-----");
		
		Node mergedNode=Operations.mergeSortedLL(head1, head2);
		
		Operations.iterate(mergedNode);
		System.out.println();
		System.out.println("-----");
		
	}
	
	
}
