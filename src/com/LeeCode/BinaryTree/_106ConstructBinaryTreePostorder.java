package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

/**
 * 已知中序遍历与后序遍历求出数结构
 * 
 * @author ttt
 *
 */
public class _106ConstructBinaryTreePostorder
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public TreeNode buildTree(int[] inorder, int[] postorder)
	{

		return treeCreate(postorder.length - 1, 0, inorder.length - 1, inorder,
				postorder);

	}

	private TreeNode treeCreate(int posStart, int inStart, int inEnd,
			int[] inorder, int[] postorder)
	{

		if(posStart<0||inStart>inEnd) return null;
		
		int inIndex = 0;
		TreeNode root = new TreeNode(postorder[posStart]);
		for (int i = inStart; i <= inEnd; i++)
		{
			if (inorder[i] == root.val)
				inIndex = i;
		}

		root.right = treeCreate(posStart-1, inIndex+1, inEnd, inorder, postorder);
		root.left = treeCreate(posStart-inEnd+inIndex-1, inStart, inIndex-1, inorder, postorder);
		return root;

	}
}
