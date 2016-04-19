package com.LeeCode;

public class ClimbingStairs
{

	public static void main(String[] args)
	{
		ClimbingStairs cs = new ClimbingStairs();
		cs.climbStairs(10);

	}

	public int climbStairs(int n)
	{
		 
		    if(n == 0 || n == 1 || n == 2){return n;}
		    int[] mem = new int[n];
		    mem[0] = 1;
		    mem[1] = 2;
		    for(int i = 2; i < n; i++){
		        mem[i] = mem[i-1] + mem[i-2];//从第二步到第三步，从第一步到第三步，只此两种情况，因为每次最多只能走两步
		    }
		    return mem[n-1];
	}
}
