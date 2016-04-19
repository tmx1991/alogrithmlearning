package com.LeeCode;

public class UniquePaths
{
   public int x=0;
	public static void main(String[] args)
	{
		UniquePaths up = new UniquePaths();
		up.uniquePaths(3,7);

	}

	public int uniquePaths(int m, int n)
	{
		
		 if(m==0||n==0||m==1&n==1)
			 return x;
		 else if(m==1||n==1)
			 return 1;
		 x = uniquePaths(m-1,n)+uniquePaths(m,n-1);
		return x;

	}
 
}
