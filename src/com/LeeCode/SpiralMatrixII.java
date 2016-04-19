package com.LeeCode;

public class SpiralMatrixII
{

	public static void main(String[] args)
	{
		SpiralMatrixII sm = new SpiralMatrixII();
		int n = 3;
		sm.generateMatrix(n);

	}

	public int[][] generateMatrix(int n)
	{
		if (n == 0)
			return null;
		int[][] m = new int[n][n];
		int a = 0, b = 0, i = 0, flag = n / 2, l = n;
		while (i<=l*l)
		{
			while (b < n&&a<=n)
			{
				m[a][b++] = i++;
			}
			b--;
			a++;
			while (a < n&&b>=0)
			{
				m[a++][b] = i++;
			}
			b--;
			a--;
			while (a>=0&&b >= l - n)
			{
				m[a][b--] = i++;
			}
			b++;
			a--;
			while (a > l - n&&b<=n)
			{
				m[a--][b] = i++;
			}
			b++;
			a++;
			n--;

		}
		for (i = 0; i < l; i++)
		{
			for (int j = 0; j < l; j++)
				System.out.print(m[i][j] + ",");
		}
		System.out.println();

		return null;

	}
}
