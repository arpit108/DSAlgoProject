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

}
