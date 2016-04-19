package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import com.LeeCode.basefouction.TreeNode;

public class _101SymmetriTree
{
	static List<Integer> ls = new ArrayList<Integer>();

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(5);
		t1.left = new TreeNode(4);
		t1.right = new TreeNode(1);

		t1.left.right = new TreeNode(1);

		t1.right.right = new TreeNode(4);

		t1.right.right.left = new TreeNode(2);
		t1.left.right.left = new TreeNode(2);

		_101SymmetriTree st = new _101SymmetriTree();
		System.out.println(st.isSymmetric(t1));
	}

	public boolean isSymmetric(TreeNode root)
	{
		return root == null || isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(TreeNode left, TreeNode right)
	{
		if (left == null || right == null)
			return left==right;
		if (left.val != right.val)
			return false;
		else
			return isSymmetricHelp(left.left, right.right)
					&& isSymmetricHelp(left.right, right.left);

	}

}
