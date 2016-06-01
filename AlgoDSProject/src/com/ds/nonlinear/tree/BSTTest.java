package com.ds.nonlinear.tree;

import org.junit.Test;

public class BSTTest {

	
	@Test
	public void testAddNode()
	{
		BST root =BinaryTreeOperations.addNode(null, 20);
		
		root =BinaryTreeOperations.addNode(root, 10);
		
		 root =BinaryTreeOperations.addNode(root, 30);
		root =BinaryTreeOperations.addNode(root, 5);
		root =BinaryTreeOperations.addNode(root, 15);
		root =BinaryTreeOperations.addNode(root, 35);
		root =BinaryTreeOperations.addNode(root, 25);
		
		
		BinaryTreeOperations.printNodes(root);
		
		
	}
	
	
}
