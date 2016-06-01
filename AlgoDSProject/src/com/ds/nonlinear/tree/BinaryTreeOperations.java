package com.ds.nonlinear.tree;

public class BinaryTreeOperations {

	
	public static BST addNode(BST root,int data)
	{
		BST head=root;
		
		if(head==null)
			return new BST(data);
		
		
		if(data>head.data)
		{
			head= addNode(head.right,data);
		}
		else
		{
			head=addNode(head.left,data);
		}
		
		return root;
	}

	
	public static void printNodes(BST root)
	{

		if(root!=null)
		{
			
			printNodes(root.left);
			System.out.println(root.data+"-->");
			printNodes(root.right);
			
		}
		
		
	}
	
	
	
}
