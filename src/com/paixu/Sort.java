package com.paixu;

public class Sort
{

	public static void main(String[] args)
	{
		Sort S = new Sort();
		int[] a={0,36,20,18,10,60,25};//首位为监视哨
 
		S.InsertSort(a);
		
	}
	
	public void InsertSort(int[] R)
	{
		int i, j;
		for(i = 2; i < R.length; i++)
			if(R[i] < R[i - 1])
			{
				R[0] = R[i];
				for(j = i - 1; R[0] < R[j]; j--)
					R[j + 1] = R[j];
				R[j + 1] = R[0];

			}
		for(i=1;i<R.length;i++)
		System.out.println(R[i]);
	}
}
