package com.test;

public class LinfindMissing
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		LinfindMissing Lfm = new LinfindMissing();
		int[] a= {9,8,7,6,2,0,1,5,4};
		System.out.println("---rs="+Lfm.findMissing(a));
	}

	public int findMissing(int[] nums)
	{
		// write your code here
		int i = 0, l=0,j = -1, flag = 0,temp;
		l = nums.length;

		for(i = 0; i < l; i++)
		{
			flag = nums[i];
			
			
			
			
			while((flag != i) && (flag != -1)&& (flag != l))
			{
				
				temp = nums[flag];
				nums[i] = temp;
				nums[flag] = flag;
				
			    flag=temp;
			 
			}
			
			if(flag==l)
			{
				nums[i]=-1;
				
				j=i;
			}
			
			if(flag==-l)
				j=i;
		}
		
		for(temp = 0;temp < l; temp++)
			System.out.print(nums[temp]+" ");
		System.out.println(j+"=j");
		
		if(j==-1)
			return l;

		else
		return j;

	}
}
