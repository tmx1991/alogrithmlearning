package com.LeeCode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class _93RestoreIPAddresses
{

	private String sa;
	private int[] ip;
	private int n;
	private List<String> res;

	public static void main(String[] args)
	{
		_93RestoreIPAddresses ria = new _93RestoreIPAddresses();

		ria.restoreIpAddresses("0000");

	}

	public List<String> restoreIpAddresses(String s)
	{
		ip = new int[4];
		n = s.length();
		res = new ArrayList<String>();
		if (s.length() < 4 || s.length() > 12)
			return res;
		sa = s;

		recursion(0, 0);
		return res;

	}

	private void recursion(int i, int x)
	{
		if (x == 4)
		{
			if (i == n)
			{
				System.out.println(ip[0] + "." + ip[1] + "." + ip[2] + "."
						+ ip[3]);
				res.add(ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]);
			}

		} else
		{

			if (i < n && sa.charAt(i) == '0')
			{

				ip[x] = 0;
				recursion(i + 1, x + 1);
			} else
			{

				for (int a = 1; a <= 3 && i + a <= n; a++)
				{

					if (Integer.parseInt(sa.substring(i, i + a)) <= 255)
					{
						ip[x] = Integer.parseInt(sa.substring(i, i + a));
						recursion(i + a, x + 1);
					}
				}
			}

		}

	}
}
