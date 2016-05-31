package com.ds.nonlinear.tree;

import org.junit.Test;

public class BSTTest {

	
	@Test
	public void testAddNode()
	{
		BST root =BinaryTreeOperations.addNode(null, 20);
		
		root =BinaryTreeOperations.addNode(null, 10);
		
		 root =BinaryTreeOperations.addNode(null, 30);
		root =BinaryTreeOperations.addNode(null, 5);
		
		BinaryTreeOperations.printNodes(root);
		
		
	}
	
	
}
