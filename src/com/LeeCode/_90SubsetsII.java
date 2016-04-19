package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author ttt from idea
 *
 */
public class _90SubsetsII
{

	private List<List<Integer>> res;

	private int a;

	public static void main(String[] args)
	{
		int[] data = new int[] { 1, 2, 2, 3, 5 };

		_90SubsetsII sbii = new _90SubsetsII();

		sbii.subsetsWithDup(data);

	}

	public List<List<Integer>> subsetsWithDup(int[] nums)
	{
		res = new ArrayList<List<Integer>>();

		List<Integer> each = new ArrayList<Integer>();

		Arrays.sort(nums);
		recursion(each, 0, nums);
//		for (int j = 0; j < res.size(); j++)
//		{
//			for (int m = 0; m < res.get(j).size(); m++)
//				System.out.print(res.get(j).get(m) + "*");
//			System.out.println();
//		}

		return res;

	}

	/**
	 * 此递归方法必须掌握
	 * 
	 *
	 * @param each
	 * @param pos
	 * @param n
	 */
	public void recursion(List<Integer> each, int pos,
			int[] n)
	{
		if (pos <= n.length)
		{
			res.add(new ArrayList<Integer>(each));
		}

		int i = pos;
		while (i < n.length)
		{
			each.add(n[i]);

			recursion(each, i + 1, n);

			each.remove(each.size() - 1);

			i++;

			while (i < n.length && n[i] == n[i - 1])
				i++;

		}
		return;
	}
}
