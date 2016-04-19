package com.Sorts;

public class fastSort
{

	private static int[] a;

	public static void main(String[] args)
	{
		a = new int[]{12,3,4,6,3,65,67,90};
		fastSort fs = new fastSort();
		
		fs.quickSort(0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		

	}
	
	public void quickSort(int begin,int end)
	{
		int q;
		
		if(end>begin)
		{
			q = partition(begin, end);
			
			quickSort(begin,q-1);
			quickSort(q+1, end);
		}
		
	}
	
	public int partition(int begin,int end)
	{
		int i = begin - 1;
		int j = begin;
		int x = a[end];
		int temp;
		
		for(j = begin;j<end;j++)
		{
			if(a[j]<=x)
			{
				i = i+1;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		a[end] = a[i+1];
		a[i+1] = x;
		
		return i+1;
	}

}
