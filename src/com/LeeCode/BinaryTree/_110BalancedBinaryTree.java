package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeNode;

public class _110BalancedBinaryTree
{
 

	public static void main(String[] args)
	{
		_110BalancedBinaryTree bbt = new _110BalancedBinaryTree();
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(9);
//		t1.right = new TreeNode(20);

//		t1.left.left = new TreeNode(1);
		t1.left.right = new TreeNode(1);

//		t1.right.left = new TreeNode(15);
//		t1.right.right = new TreeNode(7);
		bbt.isBalanced(t1);

	}

	public boolean isBalanced(TreeNode root)
	{

		int c = inorderTreeWalk(root, 0);
		if (c == -1)
		{
			System.out.println("false");
			return false;
		}
			
		else
		{
			System.out.println("true");
			return true;
		}
		

	}

	public int inorderTreeWalk(TreeNode x, int sum)
	{
		
		int ll,rl;

		if (x != null)
		{
			if((ll = inorderTreeWalk(x.left, sum + 1))==-1) return -1;

			if((rl = inorderTreeWalk(x.right, sum + 1))==-1) return -1;
			
			if(ll-rl>1||ll-rl<-1) return -1;
			else 
				return ll>rl?ll:rl;

		} else
		{
 
			return sum;
		}

	}

}
