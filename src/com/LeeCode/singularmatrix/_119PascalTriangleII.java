package com.LeeCode.singularmatrix;

import java.util.ArrayList;
import java.util.List;

public class _119PascalTriangleII
{

	public static void main(String[] args)
	{
		_119PascalTriangleII ptii = new _119PascalTriangleII();
		List<Integer> res = ptii.getRow(9);
		
		for(int j=0;j<res.size();j++)
			System.out.print(res.get(j)+",");
		System.out.println();
	}

	public List<Integer> getRow(int rowIndex)
	{
		List<Integer> res = new ArrayList<Integer>();
		if (rowIndex < 0)
			return res;

		res.add(1);

		int i = 0, j = 0;
		for (i = 1; i <= rowIndex; i++)
		{

			for (j = 0; j < res.size()-1; j++)
				res.set(j,res.get(j + 1) + res.get(j));//不能改变过多的

			res.add(0,1);

		}

		return res;

	}
}
