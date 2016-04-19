package com.LeeCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import com.LeeCode.basefouction.TreeLinkNode;
import com.LeeCode.basefouction.TreeNode;

public class _116PopulatingNextRightPointersinEachNode
{

	private List<List<TreeLinkNode>> ls;

	public static void main(String[] args)
	{
		_116PopulatingNextRightPointersinEachNode pnrpe = new _116PopulatingNextRightPointersinEachNode();
		TreeLinkNode t1 = new TreeLinkNode(1);
		t1.left = new TreeLinkNode(2);
		t1.right = new TreeLinkNode(3);
		
		t1.left.left = new TreeLinkNode(4);
		t1.left.right = new TreeLinkNode(5);
		t1.right.right = new TreeLinkNode(6);
		t1.right.left = new TreeLinkNode(7);
		pnrpe.connect(t1);
	}

	public void connect(TreeLinkNode root)
	{
		ls = new ArrayList<List<TreeLinkNode>>();
		
		
		if(root==null) return;
		List<TreeLinkNode> linkNodes = new ArrayList<TreeLinkNode>();
		ls.add(linkNodes);
		connect0(root, 0);

		int i, j;
		for (i = 0; i < ls.size(); i++)
		{
			for (j = 0; j < ls.get(i).size() - 1; j++)
			{
				System.out.print(ls.get(i).get(j).val + "->");
				ls.get(i).get(j).next = ls.get(i).get(j + 1);
			}
			System.out.println(ls.get(i).get(j).val);
		}
	}

	private void connect0(TreeLinkNode root, int n)
	{
		if (root == null)
		{
			return;

		} else
		{

			if (ls.size()-1 < n)
			{
				List<TreeLinkNode> linkNodes = new ArrayList<TreeLinkNode>();
				linkNodes.add(root);
				ls.add(linkNodes);
			} else
			{
				ls.get(n).add(root);
			}
			connect0(root.left, n + 1);
			connect0(root.right, n + 1);

		}

	}
}
