package com.LeeCode;

public class StringtoInteger
{

	public static void main(String[] args)
	{
		StringtoInteger atoi = new StringtoInteger();
		String a1 = "2147483648";
		System.out.println(atoi.myAtoi(a1));

	}

	public int myAtoi(String str)
	{
		int sign = 1;
		int i = 0;
		if(str==null)
			return 0;
		 
		char[] ch = str.trim().toCharArray();
		int  sb = 0,sb1=0;
		if(ch.length==0)
			return 0;
		if (ch[0] == '-' || ch[0] == '+')
		{
			sign = ch[0] == '-' ? -1 : 1;
			i = 1;
		}
		 
		for (; i < ch.length; i++)
		{
			if (ch[i] < '0' || ch[i] > '9')
				break;
			if (ch[i] >= '0' && ch[i] <= '9')
			{
				sb1 = sb * 10 + (int) ch[i] - 48;
				if (sb>Integer.MAX_VALUE/10||((sb==Integer.MAX_VALUE/10)&&(sign == 1 && ch[i]>='7' || sign == -1&& ch[i] >= '8')))
				{
					 return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
				}
				sb = sb1;
			} 
		}
		return sign*sb;
	
	}
}
