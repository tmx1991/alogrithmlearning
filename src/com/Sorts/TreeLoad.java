package com.Sorts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.LeeCode.basefouction.TreeNode;

/**
 * 有一棵二叉树，树上每个点标有权值，权值各不相同，请设计一个算法算出权值最大的叶节点到权值最小的叶节点的距离。二叉树每条边的距离为1，
 * 一个节点经过多少条边到达另一个节点为这两个节点之间的距离。 给定二叉树的根节点root，请返回所求距离
 * 
 * @author ttt
 *
 */
public class TreeLoad
{

	int MAX = Integer.MIN_VALUE;
	int MIN = Integer.MAX_VALUE;
	
	List<TreeNode> list = new ArrayList<TreeNode>();

	public static void main(String[] args)
	{

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

		TreeLoad tl = new TreeLoad();

		tl.getDis(t1);

	}

	public int getDis(TreeNode root)
	{
		int a=0;
		Set<TreeNode> hsMaxLoad = new HashSet<TreeNode>();
		Set<TreeNode> hsMinLoad = new HashSet<TreeNode>();
		TreeNode t3 = new TreeNode(44);
		
		hsMaxLoad.add(t3);

	    if(root == null) return 0;
		
		list.add(root);
	 
		getOrder(root, root.val,hsMaxLoad,hsMinLoad);

		System.out.println(MAX + "," + MIN);
		 for (TreeNode st : hsMaxLoad)
		 System.out.print(st.val+",");
		 System.out.println();
		 for (TreeNode sti : hsMinLoad)
		 System.out.print(sti.val+",");
		 System.out.println();
		 
		 for(TreeNode li:hsMaxLoad)
		 {
			 if(hsMinLoad.contains(li))
			 {
				 a++;
			 }
		 }
		 System.out.println(hsMaxLoad.size()+hsMaxLoad.size()-a);
		return 0;
	}

	// 遍历求得到最大叶子节点与最小叶子节点的路径
	public void getOrder(TreeNode r, int value,Set<TreeNode> ha,Set<TreeNode> hi)
	{
		if (r.left == null && r.right == null)
		{
			
			if (value > MAX)
			{
				ha.clear();
				for(TreeNode l:list)
					ha.add(l);
				MAX = value;
			}
				
			if (value < MIN)
			{
				hi.clear();
				for(TreeNode l:list)
					hi.add(l);
				MIN = value;
			}
				

		} else
		{
			if (r.left != null)
			{
				list.add(r.left);
				getOrder(r.left, value+r.left.val,ha,hi);
				list.remove(list.size()-1);
			}
			if (r.right != null)
			{
				list.add(r.right);
				getOrder(r.right, value+r.right.val,ha,hi);
				list.remove(list.size()-1);
			}
		}
	}

}
