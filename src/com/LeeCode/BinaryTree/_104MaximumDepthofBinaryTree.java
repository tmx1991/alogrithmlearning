package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

public class _104MaximumDepthofBinaryTree
{

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(9);
		t1.right = new TreeNode(20);

		t1.right.left = new TreeNode(15);

		t1.right.right = new TreeNode(7);
		_104MaximumDepthofBinaryTree mdb = new _104MaximumDepthofBinaryTree();
		System.out.println(mdb.maxDepth(t1));
	}

	public int maxDepth1(TreeNode root)
	{
		return inOrderTree(root, 0);
	}

	private int inOrderTree(TreeNode root, int i)
	{
		if (root == null)
		{
			return i;
		}
		return Math.max(inOrderTree(root.left, i + 1),
				inOrderTree(root.right, i + 1));
	}

	public int maxDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
