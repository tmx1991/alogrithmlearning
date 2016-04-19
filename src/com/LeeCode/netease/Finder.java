package com.LeeCode.netease;

import commonalgorithms.quickSort;

public class Finder
{

	public static void main(String[] args)
	{
		Finder finder = new Finder();

		int[] a = new int[] { 2, 3, 4, 2, 22, 44 };
		int n = a.length;
		int K = 3;

		System.out.println(n);
		System.out.println(finder.findKth(a, n, K));

	}

	public int findKth(int[] a, int n, int K)
	{

		K = n - K + 1;

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + ",");
		System.out.println();

		// quickSort(a, 0, n - 1, K);

		int y = 12;
		test(a, y);
		System.out.println(a[K - 1]);

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + ",");
		System.out.println();
		System.out.println(y);
		return a[K - 1];
		// write code here
	}

	public void test(int[] b, int x)
	{
		b[3] = 100;
		x = 333;
	}

	public void quickSort(int[] a, int begin, int end, int K)
	{
		int q = 0;

		if (end > begin)
		{
			q = partition(a, begin, end);

			// if (q > K)
			// {
			quickSort(a, begin, q - 1, K);
			// } else if (q < K)
			// {
			quickSort(a, q + 1, end, K);
			// } else
			// {
			// return;
			// }

		}

	}

	public int partition(int[] a, int begin, int end)
	{
		int i = begin - 1;
		int j = begin;
		int x = a[end];
		int temp;

		for (j = begin; j < end; j++)
		{
			if (a[j] <= x)
			{
				i = i + 1;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		a[end] = a[i + 1];
		a[i + 1] = x;

		return i + 1;

	}
}
