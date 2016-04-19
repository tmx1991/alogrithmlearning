package com.LeeCode.singularmatrix;

import java.util.ArrayList;
import java.util.List;

public class _118PascalsTriangle
{

	public static void main(String[] args)
	{
		_118PascalsTriangle pt = new _118PascalsTriangle();
		List<List<Integer>> lr =  pt.generate(10);
		
		for(int i=0;i<lr.size();i++)
		{
			for(int j=0;j<lr.get(i).size();j++)
				System.out.print(lr.get(i).get(j)+",");
			System.out.println();
		}
			
		
		
	}

	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows == 0) return res;
		
		List<Integer> l0 = new ArrayList<Integer>();
		l0.add(1);
		res.add(l0);
		
		int i=0,j=0;
		for(i=1;i<=numRows-1;i++)
		{
			List<Integer> ls = new ArrayList<Integer>();
			ls.add(1);
			
			for(j=1;j<i;j++)
				ls.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
			
			ls.add(1);
			
			res.add(ls);
		}
		
		return res;

	}
}














