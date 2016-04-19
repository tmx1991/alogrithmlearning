package com.LeeCode;

public class SearchInsertPosition
{

	public static void main(String[] args)
	{
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums = new int[]{1,3,5,6};
		int target = 7;
		System.out.println(sip.searchInsert(nums, target));
		

	}

	public int searchInsert(int[] nums, int target)
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] >= target)
				return i;
		    if(i==nums.length-1)
		    	return i+1;
		}

		return target;

	}
}
