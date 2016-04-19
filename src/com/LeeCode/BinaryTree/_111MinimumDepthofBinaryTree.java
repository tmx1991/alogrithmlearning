package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

public class _111MinimumDepthofBinaryTree
{
	int min = -1;

	public static void main(String[] args)
	{
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(9);
//		t1.left.right = new TreeNode(1);

		_111MinimumDepthofBinaryTree mdbt = new _111MinimumDepthofBinaryTree();

		mdbt.minDepth(t1);

	}

	public int minDepth(TreeNode root)
	{
		int i;
		i=inorderTreeWalk(root);
		System.out.println(i);
	 
		return i;

	}

	public int inorderTreeWalk(TreeNode x)
	{
		if(x == null)
	        return 0;
	        int left=minDepth(x.left);
	        int right=minDepth(x.right);
	        if(left==0)
	            return right+1;
	        if(right==0)
	            return left+1;
	    return left<right ? left+1:right+1;
 
	 

	}
}
