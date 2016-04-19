package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import com.LeeCode.basefouction.TreeNode;

public class _113PathSumII
{

	List<List<Integer>>  res = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		_113PathSumII ps = new _113PathSumII();

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

		int sum = 22;

		List<List<Integer>> r = ps.pathSum(t1, sum);
		
		for (int i = 0; i < r.size(); i++)
		{
			for (int j = 0; j <r.get(i).size(); j++)
			    System.out.print(r.get(i).get(j) + "->");
			System.out.println();
		}
		

	}

	public List<List<Integer>> pathSum(TreeNode root, int sum)
	{
		List<Integer> list = new ArrayList<Integer>();
		if(root == null) return res;
		inOrderTravel(root, sum, list);
		return res;

	}
	
/**
 * 根节点到叶子节点的所有路径输出
 * @param r
 * @param n
 * @param list
 */
	public void inOrderTravel(TreeNode r, int n, List<Integer> list)
	{
		list.add(r.val);

		if (r.left == null && r.right == null)
		{
			int sum =0;
			// 输出list
			for (int i = 0; i < list.size(); i++)
			{
				System.out.print(list.get(i) + "->");
				sum += list.get(i);
			}
				
			System.out.println("end");
			
			if(sum == n ) res.add(list);

		} else
		{
			if (r.left != null)
			{
				List<Integer> l = new ArrayList<Integer>(list);
				inOrderTravel(r.left, n, l);
			}
			if (r.right != null)
			{
				List<Integer> l = new ArrayList<Integer>(list);
				inOrderTravel(r.right, n, l);
			}

		}

	}

}
