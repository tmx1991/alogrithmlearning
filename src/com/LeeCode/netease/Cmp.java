package com.LeeCode.netease;

/**
 * 小明陪小红去看钻石，他们从一堆钻石中随机抽取两颗并比较她们的重量。这些钻石的重量各不相同。在他们们比较了一段时间后，它们看中了两颗钻石g1和g2。
 * 现在请你根据之前比较的信息判断这两颗钻石的哪颗更重。
 * 给定两颗钻石的编号g1,g2，编号从1开始，同时给定关系数组vector,其中元素为一些二元组，第一个元素为一次比较中较重的钻石的编号
 * ，第二个元素为较轻的钻石的编号
 * 。最后给定之前的比较次数n。请返回这两颗钻石的关系，若g1更重返回1，g2更重返回-1，无法判断返回0。输入数据保证合法，不会有矛盾情况出现。 测试样例：
 * 2,3,[[1,2],[2,4],[1,3],[4,3]],4 返回: 1
 * 
 * @author ttt
 *
 */
public class Cmp
{

	public static void main(String[] args)
	{
		Cmp cmp = new Cmp();
		int g1 = 2;
		int g2 = 3;
		int[][] data = new int[][] { { 1, 2 }, { 2, 4 }, { 1, 3 }, { 4, 3 } };

		// System.out.println(data[1][1]);

		int n = 4;

		cmp.cmp(g1, g2, data, n);

	}

	// 深度遍历即可解决

	public int cmp(int g1, int g2, int[][] records, int n)
	{

		int[] status = new int[n];
		int c1, c2;
		c1 = CmpDFS(g1, g2, records, n, status);

		System.out.println(c1);

		status = new int[n];
		c2 = CmpDFS(g2, g1, records, n, status);

		System.out.println(c2);

		if (c1 == 1 && c2 == 0)
			return 1;
		else if (c2 == 1 && c1 == 0)
			return -1;
		else
		{
			return 0;
		}

	}

	public int CmpDFS(int g1, int g2, int[][] records, int n, int[] status)
	{
		for (int i = 0; i < n; i++)
		{
			if (status[i] == 1)
				continue;

			if (records[i][0] == g1)
			{
				status[i] = 1;

				if (records[i][1] == g2)
					return 1;
				else
				{
					if (CmpDFS(records[i][1], g2, records, n, status) == 1)
						return 1;
				}

				status[i] = 0;
			}
		}

		return 0;

	}
}
