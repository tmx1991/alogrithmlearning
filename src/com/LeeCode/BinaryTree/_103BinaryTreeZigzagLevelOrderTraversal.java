package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.LeeCode.basefouction.TreeNode;

public class _103BinaryTreeZigzagLevelOrderTraversal
{
	private List<List<Integer>> rs;

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
		_103BinaryTreeZigzagLevelOrderTraversal btt = new _103BinaryTreeZigzagLevelOrderTraversal();
		btt.zigzagLevelOrder(t1);

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root)
	{
		rs = new ArrayList<List<Integer>>();
		levelOrder(root, 0);

		for (int i = 0; i < rs.size(); i++)
		{
			if (i % 2 != 0)
			{
				Collections.reverse(rs.get(i));
			}
			for (int j = 0; j < rs.get(i).size(); j++)
				System.out.print(rs.get(i).get(j) + ",");
			System.out.println();
		}

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
