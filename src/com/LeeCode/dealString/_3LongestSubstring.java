/*
 * 寻找字符串的最小序列长度
 */
package com.LeeCode.dealString;

import java.util.LinkedHashSet;

public class _3LongestSubstring
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		_3LongestSubstring lsrc = new _3LongestSubstring();
		String s= "abcabcbb";
		lsrc.lengthOfLongestSubstring(s);


	}

	public int lengthOfLongestSubstring(String s)
	{
		int i=0,j=1;
		StringBuffer sb = new StringBuffer();
		if(s.length()==0)
			return 0;
		if(s.length()==1)
			return 1;
		int Lf = 0;
		int Le = 1;
		for (Le = 1; Le < s.length(); Le++)
		{
			while (s.charAt(Lf + i) != s.charAt(Le))
			{
				i++;
			}
			if (i == (Le - Lf))
			{
				if ((i + 1) > j)
				{
					j = i + 1;
				}
				i = 0;
				continue;
			} else
			{
				sb.append(i + 1);

				Lf = Lf + i + 1;

				i = 0;
			}
		}
		System.out.println("j=" + j);
		return sb.length();
	}

}
