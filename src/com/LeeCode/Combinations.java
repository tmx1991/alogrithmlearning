package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations
{
	public int tn = 0;
	public int tk = 0;
	public int[] data;
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> ca = new ArrayList<Integer>();

	public static void main(String[] args)
	{
		Combinations cb = new Combinations();
		int n = 4;
		int k = 3;
		int[] nums = new int[] {1,9,8,3,-1,0};
		cb.subsets(nums);
		// cb.combine(n, k);

	}

	public List<List<Integer>> subsets(int[] nums)
	{res.add(ca);
	System.out.println(res.get(res.size() - 1));
		if (nums.length == 0)
			return res;
		data = new int[nums.length];
		data = nums;
		Arrays.sort(data);
		tn=nums.length;
		for (tk = 1; tk <= nums.length; tk++)
			test2(0, 0);
		return res;

	}

	private void test2(int i, int x)
	{
		int a = i;
		if (x > tk - 1)
		{
			res.add(new ArrayList<Integer>(ca));

			System.out.println(res.get(res.size() - 1));
		} else
		{
			for (; i <= tn - tk + x; i++)
			{
				if (i > a && data[i] == data[a])
				{
					a = i;
					continue;
				}
				ca.add(data[i]);
				test2(i + 1, x + 1);
				ca.remove(ca.size() - 1);
			}
		}

	}

	public List<List<Integer>> combine(int n, int k)
	{

		if (k > n)
			return res;
		tn = n;
		tk = k;
		test(0, 0);

		return res;

	}

	private void test(int i, int x)
	{
		if (x > tk - 1)
		{
			res.add(new ArrayList<Integer>(ca));

			System.out.println(res.get(res.size() - 1));
		} else
		{
			for (; i <= tn - tk + x; i++)
			{
				ca.add(i + 1);
				test(i + 1, x + 1);
				System.out.println("re=" + ca.remove(ca.size() - 1));
			}
		}

	}
}
