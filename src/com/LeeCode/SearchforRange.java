package com.LeeCode;

import java.util.Arrays;

public class SearchforRange
{

	public static void main(String[] args)
	{
		SearchforRange sr = new SearchforRange();
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int[] s = new int[2];
		s= sr.searchRange(nums, 6);
		System.out.println(s[0]+","+s[1]);
	}

	public int[] searchRange(int[] nums, int target)
	{
		int len = nums.length;
		int[] c = new int[len];
		int[] r = new int[2];
		c[0] = -1;
	 
		int i = 0,j=0;
		for (; i < len; i++)
		{
			if (nums[i] == target)
			{ 
				c[j] = i;
				j++;
				 
			}
			else if(nums[i] > target)
			{break;}
			
		}
		
		r[0] = c[0];
		
		r[1] = c[0]==-1?-1:c[0]+j-1;
		return  r;

	}
}
