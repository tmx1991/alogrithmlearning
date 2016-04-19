package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.LeeCode.basefouction.TreeNode;
/**
 * 按顺序输出每层二叉树
 * @author ttt
 *
 */
public class _102BinaryTreeLevelOrderTraversal
{

	private List<List<Integer>> rs;

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(9);
		t1.right = new TreeNode(20);

		t1.right.left = new TreeNode(15);

		t1.right.right = new TreeNode(7);
		_102BinaryTreeLevelOrderTraversal btt = new _102BinaryTreeLevelOrderTraversal();
		btt.levelOrder(t1);

	}

	public List<List<Integer>> levelOrder(TreeNode root)
	{
		rs = new ArrayList<List<Integer>>();
		levelOrder(root, 0);
		for (int i = 0; i < rs.size(); i++)
		{
			for (int j = 0; j < rs.get(i).size(); j++)
				System.out.print(rs.get(i).get(j) + ",");
			System.out.println();
		}

		Collections.reverse(rs.get(1));
		 
		return rs;

	}

	private void levelOrder(TreeNode root, int i)
	{
		if (root == null)
			return;
		if (rs.size() < i + 1)
		{
			List<Integer> ls = new ArrayList<Integer>();
			ls.add(root.val);
			rs.add(new ArrayList<Integer>(ls));
		} else
			rs.get(i).add(root.val);
		levelOrder(root.left, i + 1);
		levelOrder(root.right, i + 1);

	}
}
