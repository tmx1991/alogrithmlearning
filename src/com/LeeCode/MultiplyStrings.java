package com.LeeCode;

public class MultiplyStrings
{

	public static void main(String[] args)
	{
		MultiplyStrings ms = new MultiplyStrings();
		String s1 = "1234567";
		String s2 = "2345678";
		ms.multiply(s1, s2);
	}

	public String multiply(String num1, String num2)
	{
		StringBuffer sb  =new StringBuffer();
		if(num1.length()==0||num2.length()==0) {sb.append("0");return sb.toString();}
		if(num1.charAt(0)=='0'||num2.charAt(0)=='0') {sb.append("0"); return sb.toString();}
		
		int[] res = new int[num1.length()+num2.length()];
		int i,j;
		int len1 = num1.length(),len2 = num2.length();
		
		int index;
		for(i = len1-1;i>=0;i--)
		{
			for(j=len2-1;j>=0;j--)
			{
				index = i+j+1;
				res[index] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				res[index-1] += res[index]/10;
				res[index] %= 10; 
			}
			
		}
		if(res[0]==0)
		{
			for(i=1;i<res.length;i++)
				sb.append(res[i]);
		}
		else
		{
			for(i=0;i<res.length;i++)
				sb.append(res[i]);
		}
		 
		return sb.toString();

	}
}
