package com.LeeCode;

public class LeeZigZagConversion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LeeZigZagConversion lzzc = new LeeZigZagConversion();
		String s = "abcdefijklmnopqrstuvwxyz";
		int numRows = 6;
		System.out.println(lzzc.convert(s, numRows));
 
	}
 	/*
	 * 1        13
	 * 2 6   10 14
	 * 3 7 9 11 15
	 * 4 8   12 16
	 * 5        17
	 *以上的排列并非是本题的意思，是不对的额
	 *a   i   o
	 *b f j n p t
	 *c e k m q s
	 *d   l   r
	 * 包含2m-1个数
	 */
	public String convert(String s, int numRows)
	{
		int i = 0;
		int x = 0;
		char[] ch = s.toCharArray();
		int len = ch.length;

		StringBuffer[] sb = new StringBuffer[numRows];

		for (i = 0; i < sb.length; i++)
			sb[i] = new StringBuffer();
		i = 0;
		while (i < len)
		{
			for (x = 0; x < numRows && i < len; x++) // 每一行的额StringBuffer分别逐个接收字符
				sb[x].append(ch[i++]);
			for (x = numRows - 2; x >= 1 && i < len; x--) // 非正常行的接收
				sb[x].append(ch[i++]);
		}
		// for (int x = 0; idx < sb.length; x++)
		// System.out.println(sb[x].toString());
		// return null;
		for (x = 1; x < sb.length; x++)
			sb[0].append(sb[x]);
		return sb[0].toString();

	}

}
