/*
 *排列组合问题 
 */
package com.test;

public class LinkthPrimeNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkthPrimeNumber Lkt = new LinkthPrimeNumber();
		System.out.println(Lkt.kthPrimeNumber(11));

	}

	public long kthPrimeNumber(int k)
	{

		StringBuffer sb = new StringBuffer();
		int i = 1, flag = 0, m = 0, temp = 1, temp2 = 0, n;
		int[] a = new int[4];
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		sb.append(1);
		flag++;
		System.out.println("xx" + flag + "=" + sb.toString());
		if(flag == k)
			return 3;

		while(true)
		{
			for(m = 0; m < sb.length(); m++)
			{
				temp2 = Integer.parseInt(String.valueOf(sb.charAt(sb.length()
						- 1 - m)));
				if(temp2 != 3)
				{
					sb.setCharAt(sb.length() - 1 - m, String.valueOf(++temp2)
							.charAt(0));
					for(n = 0; n < m; n++)
						sb.setCharAt(sb.length() - 1 - n, String.valueOf(temp2)
								.charAt(0));
					flag++;
					System.out.println("xx" + flag + "=" + sb.toString());
					if(flag == k)
					{
						for(int x = 0; x < sb.length(); x++)
						{
							temp2 = Integer.parseInt(String.valueOf(sb
									.charAt(x)));
							temp = temp * a[temp2];
						}
						return temp;
					}
					m = -1;
				}
			}
			if(m == sb.length())
			{
				for(n = 0; n < sb.length(); n++)
					sb.setCharAt(sb.length() - 1 - n,
							String.valueOf(1).charAt(0));
				sb.append(1);
				flag++;

				System.out.println("xx" + flag + "=" + sb.toString());
				if(flag == k)
				{
					for(int x = 0; x < sb.length(); x++)
					{
						temp2 = Integer.parseInt(String.valueOf(sb.charAt(x)));
						temp = temp * a[temp2];
					}

					return temp;
				}
			}
		}
	}
}
