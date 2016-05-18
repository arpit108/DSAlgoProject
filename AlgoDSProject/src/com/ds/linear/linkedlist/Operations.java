package com.ds.linear.linkedlist;

import java.util.Stack;

public class Operations {

	public static void iterate(Node node) {

		while (node != null) {
			System.out.print(" " + node.data + "-->");
			node = node.next;
		}
	}

	public static Node insertFirst(Node node, int data) {

		Node head = new Node(data);

		if (node != null) {
			head.next = node;
		}
		return head;
	}

	public static Node insertLast(Node node, int data) {

		Node n = new Node(data);

		Node head = node;
		if (head == null) {

			return n;
		} else {

			while (head.next != null) {
				head = head.next;
			}

			head.next = n;

			return node;
		}
	}

	public static Node insertAtIndex(Node n, int index, int data) {
		Node newNode = new Node(data);
		Node head = n;

		for (int i = 0; i < index; i++) {
			if (head.next == null) {
				throw new IndexOutOfBoundsException();
			}
			head = head.next;

		}

		Node nextNode = head.next;
		head.next = newNode;
		newNode.next = nextNode;

		return n;
	}

	public static void reversePrint(Node n) {
		Stack<Integer> s = new Stack<Integer>();
		while (n != null) {
			s.push(n.data);

			n = n.next;
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop() + "-->");
		}
	}

	/*
	 * 
	 * Index of Linked List start with zero
	 */

	public static Node deleteAtIndex(Node head, int index) throws Exception {

		Node n = head;

		if (head == null) {
			throw new Exception("Nothing to delete LinkedList Empty");
		} else if (head.next == null && index == 1) {
			return null;
		} else if (head.next != null && head.next.next == null) {
			if (index == 1) {
				return head.next;
			} else if (index == 2) {
				head.next = null;
				return head;
			}

		} else {
			for (int i = 1; i < index; i++) {
				if (n.next == null || n.next.next == null) {
					throw new IndexOutOfBoundsException(
							"Index specified is greater then length of Linkedlist");
				}
				n = n.next;
			}

			Node nextNode = n.next.next;

			n.next = nextNode;

			return head;
		}
		return null;
	}

	public static Node reverse(Node head) {

		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;

			current.next = prev;

			prev = current;

			current = next;

		}

		head = prev;

		return head;
	}

	public static Node mergeSortedLL(Node head1, Node head2) {

		Node node = null;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {

				node = insertLast(node, head1.data);
				head1 = head1.next;

			} else {
				node = insertLast(node, head2.data);
				head2 = head2.next;
			}

		}

		if (head1 != null) {

			node = insertLast(node, head1.data);
			head1.next = head1;
		}

		if (head2 != null) {

			node = insertLast(node, head2.data);
			head2.next = head2;
		}

		return node;
	}

}
