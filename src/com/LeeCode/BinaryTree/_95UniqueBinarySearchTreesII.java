package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import com.LeeCode.basefouction.TreeNode;

/**
 * 已知中序遍历，转二叉树，可用于二叉树的创建
 * 
 * @author ttt
 *
 */
public class _95UniqueBinarySearchTreesII
{

	private int m;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public List<TreeNode> generateTrees(int n)
	{
		List<TreeNode> rs = new ArrayList<TreeNode>();
		if (n == 0)
			return rs;
		rs = createInorderTreeNode(1, n);

		return rs;

	}

	private List<TreeNode> createInorderTreeNode(int start, int end)
	{
		List<TreeNode> ls = new ArrayList<TreeNode>();
		if (start > end)
		{
			ls.add(null);
		}
		for (int i = start; i <= end; i++)
		{
			List<TreeNode> leftlist = createInorderTreeNode(start, i - 1);
			List<TreeNode> rightlist = createInorderTreeNode(i + 1, end);

			for (TreeNode left : leftlist)
			{
				for (TreeNode right : rightlist)
				{
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					ls.add(root);
				}
			}
		}
		return ls;

	}
}
