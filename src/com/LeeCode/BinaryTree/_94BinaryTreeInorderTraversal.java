package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.LeeCode.basefouction.TreeNode;
/**
 * 中序遍历问题
 * @author ttt
 *
 */
public class _94BinaryTreeInorderTraversal
{

	private static int[] datas;
	private static int l;
	private static TreeNode t1;
	private static Stack<TreeNode> stackTn;

	public static void main(String[] args)
	{

		t1 = new TreeNode(1);
		datas = new int[] { -1, 1, 2, 3, -1, -1, 4, -1, -1, -1, -1, -1, -1, 5,
				-1, -1 };// 从1开始
		l = datas.length;
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(3);
		t1.right.left = new TreeNode(4);
		t1.right.right = new TreeNode(5);
		List<Integer> rl = new ArrayList<Integer>();
		_94BinaryTreeInorderTraversal btt = new _94BinaryTreeInorderTraversal();
		rl = btt.inorderTraversal1(t1);
		
		for(int i=0;i<rl.size();i++)
		System.out.print(rl.get(i)+",");
		System.out.println();
		
		 btt.inorderTreeWalk(t1);
	}

	public void inorderTreeWalk(TreeNode x)
	{
		if(x != null)
		{
			inorderTreeWalk(x.left);
			System.out.print(x.val+",");
			inorderTreeWalk(x.right);
		}	
		
			
	}
	public List<Integer> inorderTraversal1(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while (cur != null || !stack.empty())
		{
			while (cur != null)
			{
				stack.add(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			list.add(cur.val);
			cur = cur.right;
		}

		return list;
	}
}
