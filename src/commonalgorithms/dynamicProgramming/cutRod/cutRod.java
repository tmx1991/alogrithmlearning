package commonalgorithms.dynamicProgramming.cutRod;

/**
 * 钢条切割问题
 * 
 * @author ttt
 *
 */
public class cutRod
{

	static int[] r;
	static int[] s;

	public static void main(String[] args)
	{
		r = new int[100];
		s = new int[100];
		r[0] = 0;
		cutRod cr = new cutRod();
		int[] p = new int[] { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
		int n = 10;
		cr.extendedBottomUpCutRod(p, n);
		while (n > 0)
		{
			System.out.print(r[n] + ",");
			n--;
		}

	}

	/**
	 * 传统的递归求解，自顶向下
	 * 
	 * @param p
	 * @param n
	 * @return
	 */
	private int cut_rod(int[] p, int n)
	{
		if (n == 0)
			return 0;
		int q = 0;
		for (int i = 1; i <= n; i++)
			q = Math.max(q, p[i - 1] + cut_rod(p, n - i));
		return q;
	}

	/**
	 * 带备忘的自顶向下
	 * 
	 * @param p
	 * @param n
	 * @return
	 */
	private int memoizedCutRod(int[] p, int n)
	{
		int[] r = new int[n + 1];
		for (int i = 0; i <= n; i++)
			r[i] = -1;
		return memoizedCutRodAux(p, n, r);

	}

	private int memoizedCutRodAux(int[] p, int n, int[] r)
	{
		int q = -1;
		if (r[n] >= 0)
			return r[n];
		if (n == 0)
		{
			q = 0;
		} else
		{
			for (int i = 1; i <= n; i++)
			{
				q = Math.max(q, p[i - 1] + memoizedCutRodAux(p, n - i, r));
			}
		}
		return n;

	}

	/**
	 * 自底向上的求解
	 * 
	 * @param p
	 * @param n
	 * @return
	 */
	private int bottomUpCutRod(int[] p, int n)
	{
		int q = -1;

		for (int j = 1; j <= n; j++)
		{
			q = -1;
			for (int i = 1; i <= j; i++)
			{
				q = Math.max(q, p[i - 1] + r[j - i]);
			}

			r[j] = q;
		}
		return r[n];

	}

	private int extendedBottomUpCutRod(int[] p, int n)
	{
		int q = -1;
		int i = 0;
		for (int j = 1; j <= n; j++)
		{
			q = -1;
			for (i = 1; i <= j; i++)
				if (q < p[i - 1] + r[j - i])
				{
					q = p[i - 1] + r[j - i];
					s[j] = i;
				}
			r[j] = q;
		}
		return r[n];

	}
}
