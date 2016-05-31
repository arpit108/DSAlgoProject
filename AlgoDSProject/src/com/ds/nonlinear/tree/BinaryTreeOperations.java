package com.ds.nonlinear.tree;

public class BinaryTreeOperations {

	
	public static BST addNode(BST root,int data)
	{
		
		
		if(root==null)
			return new BST(data);
		
		
		if(data>root.data)
		{
			root= addNode(root.right,data);
		}
		else
		{
			root=addNode(root.left,data);
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
