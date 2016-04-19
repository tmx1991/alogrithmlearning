package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

public class _114FlattenBinaryTreetoLinkedList
{

	TreeNode prev = null;
	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(5);
		t1.left = new TreeNode(4);
		t1.right = new TreeNode(8);

		t1.left.left = new TreeNode(11);
		t1.left.left.left = new TreeNode(7);
		t1.left.left.right = new TreeNode(2);

		t1.right.left = new TreeNode(13);
		t1.right.right = new TreeNode(4);
		t1.right.right.left = new TreeNode(5);
		t1.right.right.right = new TreeNode(1);

		_114FlattenBinaryTreetoLinkedList fbtl = new _114FlattenBinaryTreetoLinkedList();

		fbtl.flatten(t1);
	}

	public void flatten(TreeNode root)
	{
	 	if(root == null)
	 		return;
	 	
	 	flatten(root.right);
	 	flatten(root.left);
	 	
	 	root.right = prev;
	 	
	 	root.left = null;
	 	
	 	prev = root;
	 	
		 
	}

	public TreeNode flatten2(TreeNode root,TreeNode pre)
	{
	 	if(root == null)
	 		return pre;
	 	
	 	pre = flatten2(root.right,pre);
	 	pre = flatten2(root.left,pre);
	 	
	 	root.right = pre;
	 	
	 	root.left = null;
	 	
	 	pre = root;
	 	
	 	return pre;
	 	
		 
	}
}



















