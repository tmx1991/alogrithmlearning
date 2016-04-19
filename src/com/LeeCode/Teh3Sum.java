package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Teh3Sum
{

	public static void main(String[] args)
	{
		Teh3Sum ts = new Teh3Sum();
		int[] nums = new int[] {-3,-1,0,2,4,5};
		long start = System.nanoTime();
		System.out.println(ts.fourSum(nums,2));

		long end = System.nanoTime();
		System.out.println(end - start);

	}

	public List<List<Integer>> fourSum(int[] num, int target)
	{
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(num.length<4)return ans;
        Arrays.sort(num);
        for(int i=0; i<num.length-3; i++){
            if(i>0&&num[i]==num[i-1])continue;
            for(int j=i+1; j<num.length-2; j++){
                if(j>i+1&&num[j]==num[j-1])continue;
                int low=j+1, high=num.length-1;
                while(low<high){
                    int sum=num[i]+num[j]+num[low]+num[high];
                    if(sum==target){
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while(low<high&&num[low]==num[low+1])low++;
                        while(low<high&&num[high]==num[high-1])high--;
                        low++;
                        high--;
                    }
                    else if(sum<target)low++;
                    else high--;
                }
            }
        }
        return ans;}

	public int threeSumClosest(int[] nums, int target)
	{
		int res = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		int sum = 0;
		int i = 0, j = 0, k = 0, len = nums.length;
		for (i = 0; i < len - 2; i++)
		{
			j = i + 1;
			k = nums.length - 1;
			while (j < k)
			{
				sum = nums[i] + nums[j] + nums[k];
				System.out.println("sum=" + sum);
				if (sum == target)
					return target;
				else if (sum < target)
				{
					if (target - sum < Math.abs(res - target))
						res = sum;
					j++;
				} else
				{
					if (sum - target < Math.abs(res - target))
						res = sum;
					k--;
				}
			}

		}
		return res;

	}

	public List<List<Integer>> threeSum0(int[] nums)
	{
		List<List<Integer>> listelements = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int i = 0, j = 0, k = 0, len = nums.length;
		for (i = 0; i < len - 2; i++)
		{
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1]))
			{
				j = i + 1;
				k = nums.length - 1;
				while (j < k)
				{
					if (nums[i] + nums[j] + nums[k] == 0)
					{
						listelements.add(Arrays.asList(nums[i], nums[j],
								nums[k]));
						while (j < k && nums[j] == nums[j + 1])
							j++;
						while (j < k && nums[k] == nums[k - 1])
							k--;
						j++;
						k--;
					} else if (nums[j] + nums[k] > -nums[i])
						k--;
					else
						j++;

				}
			}

		}

		return listelements;

	}

	public List<List<Integer>> threeSum(int[] num)
	{
		Arrays.sort(num);
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < num.length - 2; i++)
		{
			if (i == 0 || (i > 0 && num[i] != num[i - 1]))
			{
				int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];
				while (lo < hi)
				{
					if (num[lo] + num[hi] == sum)
					{
						res.add(Arrays.asList(num[i], num[lo], num[hi]));
						System.out.println(num[i] + "," + num[lo] + ","
								+ num[hi]);
						while (lo < hi && num[lo] == num[lo + 1])
							lo++;
						while (lo < hi && num[hi] == num[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (num[lo] + num[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}

		return res;
	}

}
