package com.LeeCode.dynamicprogramming;

public class _115DistinctSubsequences
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public int numDistinct(String s, String t)
	{
		int ls = s.length();
		int lt = t.length();
		if(s.length()==0||t.length()==0||s.length()<t.length()) {  
            return 0;  
        }
		int[][] m = new int[ls+1][lt+1];
		int i,j;
		
		for(i=0;i<=ls;i++)
		{
			m[i][0] = 1;
		}
		
		for(i=0;i<=ls;i++)
		{
			for(j=0;j<=lt;j++)
			{
				if(s.charAt(i-1) == t.charAt(j-1))
					m[i][j] = m[i-1][j-1] + m[i-1][j];
				else
					m[i][j] = m[i-1][j];
			}
		}
		
		
		return m[ls][lt];

	}
}
