package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

/**
 * 判断两棵树是否一样
 * 
 * @author ttt
 *
 */
public class _100SameTree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		else
			return false;

	}
}
