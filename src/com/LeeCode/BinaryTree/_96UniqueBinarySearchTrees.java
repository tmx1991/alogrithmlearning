package com.LeeCode.BinaryTree;

/**
 * 中序遍历的可能数： F(i, n) = G(i-1) * G(n-i)=G(n),G(0)=1, G(1)=1.
 * 
 * @author ttt
 *
 */
public class _96UniqueBinarySearchTrees
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		_96UniqueBinarySearchTrees bst = new _96UniqueBinarySearchTrees();
		System.out.println(bst.numTrees(5));
	}

	public int numTrees(int n)
	{
		int[] G = new int[n + 1];
		G[0] = G[1] = 1;

		for(int i=2;i<=n;i++)
			for(int j=1;j<=i;j++)
				G[i] += G[j-1]*G[i-j];
		return G[n];

	}
}
