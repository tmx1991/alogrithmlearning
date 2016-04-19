package com.test;

import java.awt.image.BufferStrategy;

public class LinDigitCounts
{

	public static void main(String[] args)
	{
		LinDigitCounts Ldc = new LinDigitCounts();
		
		System.out.println(Ldc.digitCounts(3,10));
 
	}

	public int digitCounts(int k, int n)
	{
		StringBuffer sb = new StringBuffer();
		int i=0,flag=0;
		for(i=0;i<=n;i++)
		sb.append(i);
		String str = String.valueOf(k);
 
		for(i = 0; i <sb.length(); i++)
		{ 
			if(str.equals(String.valueOf(sb.charAt(i))))
			{
				 
				flag++;
			}
				
		}

	 
		return flag;

	}

}
