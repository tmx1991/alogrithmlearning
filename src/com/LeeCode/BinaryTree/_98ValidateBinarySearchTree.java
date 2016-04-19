package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

/**
 * 判断是否为二叉搜索树
 * 
 * @author ttt
 *
 */
public class _98ValidateBinarySearchTree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		_98ValidateBinarySearchTree lst = new _98ValidateBinarySearchTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		// root.right = new TreeNode(3);
		System.out.println(lst.isValidBST(root));
	}

	public boolean isValidBST(TreeNode root)
	{

		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

	}
	//以一个节点为研究对象，考虑其进出两条枝干，即可
	private boolean isValidBST(TreeNode root, long minValue, long maxValue)
	{
		if (root == null)
			return true;
		if (root.val <= minValue || root.val >= maxValue)
			return false;
		return isValidBST(root.left, minValue, root.val)
				&& isValidBST(root.right, root.val, maxValue);

	}
	// 每棵子树的left《node《right，不是二叉搜索树
	public boolean isValidBST1(TreeNode root)
	{
		if (root != null)
		{
			int left = Integer.MIN_VALUE;
			int right = Integer.MAX_VALUE;
			if (root.left != null)
			{
				left = root.left.val;
			}
			if (root.right != null)
			{
				right = root.right.val;
			}

			if (left < root.val && right > root.val)
			{
				if (isValidBST(root.left) == true
						&& isValidBST(root.right) == true)
					return true;
				else
					return false;

			} else
				return false;
		}

		return true;

	}
}
