package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;
/**
 * 交换出错的两个点
 * @author ttt
 *
 */
public class _99RecoverBinarySearchTree
{
	TreeNode firstElement = null;
	TreeNode secondElement = null;
	// The reason for this initialization is to avoid null pointer exception in
	// the first comparison when prevElement has not been initialized
	TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

	public static void main(String[] args)
	{
		_99RecoverBinarySearchTree rbs = new _99RecoverBinarySearchTree();

	}

	public void recoverTree(TreeNode root)
	{

		// In order traversal to find the two elements
		traverse(root);

		// Swap the values of the two nodes
		int temp = firstElement.val;
		firstElement.val = secondElement.val;
		secondElement.val = temp;
	}

	private void traverse(TreeNode root)
	{

		if (root == null)
			return;

		traverse(root.left);

		// Start of "do some business",
		// If first element has not been found, assign it to prevElement (refer
		// to 6 in the example above)
		if (firstElement == null && prevElement.val >= root.val)
		{
			firstElement = prevElement;
		}

		// If first element is found, assign the second element to the root
		// (refer to 2 in the example above)
		if (firstElement != null && prevElement.val >= root.val)
		{
			secondElement = root;
		}
		prevElement = root;

		// End of "do some business"

		traverse(root.right);
	}
}
