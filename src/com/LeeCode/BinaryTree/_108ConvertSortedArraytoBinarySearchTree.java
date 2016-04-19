package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

public class _108ConvertSortedArraytoBinarySearchTree
{

	public static void main(String[] args)
	{
		_108ConvertSortedArraytoBinarySearchTree csabs = new _108ConvertSortedArraytoBinarySearchTree();
		int[] data = new int[] { 1, 2, 3, 4, 5, 6 };
		TreeNode t = new TreeNode(0);
		t = csabs.sortedArrayToBST(data);
		System.out.println(t.val);
		System.out.println(t.left.val + "," + t.right.val);

	}

	public TreeNode sortedArrayToBST(int[] nums)
	{
		if (nums.length == 0)
		{
			return null;
		}
		TreeNode head = helper(nums, 0, nums.length - 1);
		return head;
	}

	public TreeNode helper(int[] num, int low, int high)
	{
		if (low > high)
		{ // Done
			return null;
		}
		int mid = (low + high) / 2;
		TreeNode node = new TreeNode(num[mid]);
		node.left = helper(num, low, mid - 1);
		node.right = helper(num, mid + 1, high);
		return node;
	}
	
	
}
