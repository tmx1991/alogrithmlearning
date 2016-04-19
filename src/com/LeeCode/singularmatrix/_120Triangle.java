package com.LeeCode.singularmatrix;

import java.util.ArrayList;
import java.util.List;

public class _120Triangle
{

	public static void main(String[] args)
	{
		_120Triangle t = new _120Triangle();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(5);
		l3.add(6);
		l3.add(7);
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);

		t.minimumTotal(ll);

	}

	public int minimumTotal(List<List<Integer>> triangle)
	{
		if (triangle.size() == 0)
			return 0;
		
		int max = Integer.MAX_VALUE;

		int[][] value = new int[triangle.size()][triangle.size()];
		value[0][0] = triangle.get(0).get(0);

		if (triangle.size() == 1)
			return value[0][0];
		int i, j;
		for (i = 1; i < triangle.size(); i++)
		{
			value[i][0] = triangle.get(i).get(0) + value[i - 1][0];
			for (j = 1; j < triangle.get(i).size()-1; j++)
			{
				value[i][j] = triangle.get(i).get(j)
						+ (value[i - 1][j - 1] > value[i - 1][j] ? value[i - 1][j]
								: value[i - 1][j - 1]);
			}
			
			value[i][j] = triangle.get(i).get(j) + value[i - 1][j-1];
		}
		for(i=0;i<triangle.size();i++)
		{
			for(j=0;j<triangle.size();j++)
				System.out.print(value[i][j]+",");
			System.out.println();
		}
		
		i = triangle.size()-1;
		for(j=0;j<triangle.size();j++)
		{
			if(value[i][j]<max)
				max = value[i][j];
		}
		System.out.println(max);
		return max;

	}
}
