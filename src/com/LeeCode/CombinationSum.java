package com.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum
{
    public List<List<Integer>> res= new ArrayList<List<Integer>>();
	List<Integer> ls = new ArrayList<Integer>();
	int[] cd;
	int tar;
	private int len;

	public static void main(String[] args)
	{
		CombinationSum cs = new CombinationSum();
		int[] num = new int[] { 10,1,2,7,6,1,5 };
		int t = 7;
		
		System.out.println(cs.combinationSum(num, t));

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		
		Arrays.sort(candidates);
		len = candidates.length;
		cd = new int[len];
		cd = candidates;
		tar = target;
		 
		combII(0,0);
       System.out.println(res);
		return res;

	}

	private void combI(int sum,int n)
	{
		
       for(int i=n;i<len;i++)
		{
    	   if(i>n&&cd[i]==cd[i-1])continue;
    	   if(sum + cd[i] >tar) break;
    	   else if(sum + cd[i]==tar)
    	   {
    		    ls.add(cd[i]);
    		   
    		    res.add(new ArrayList<Integer>(ls));
    		    System.out.println("ls="+ls);
    		    ls.remove(ls.size()-1);
    		   break;
    	   }
    	   else
    	   {
    		   ls.add(cd[i]);
    		   combI(sum + cd[i],i);
    		   ls.remove(ls.size()-1);
    	   }
		}
	}
	
	private void combII(int sum,int n)
	{
       for(int i=n;i<len;i++)
		{if(i>n&&cd[i]==cd[i-1])continue;
    	   if(sum + cd[i] >tar) break;
    	   else if(sum + cd[i]==tar)
    	   {
    		    ls.add(cd[i]);
    		   
    		    res.add(new ArrayList<Integer>(ls));
    		    System.out.println("ls="+ls);
    		    ls.remove(ls.size()-1);
    		   break;
    	   }
    	   else
    	   {
    		   ls.add(cd[i]);
    		   combII(sum + cd[i],i+1);
    		   ls.remove(ls.size()-1);
    	   }
		}
	}
}










