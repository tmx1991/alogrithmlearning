package com.LeeCode;

public class ReplaceSpace
{

	public static void main(String[] args)
	{
	 
		ReplaceSpace rp = new ReplaceSpace();
		char[] ch =new char[]{'a','b',' ','c','d',' ','k'};
		int len = 0;
		for(int i =0;i<ch.length;i++)
			
			if(ch[i]==' ')
			{
				len++;
			}
	 System.out.println(len);
		System.out.println(rp.replaceBlank(ch, len));
	}

	public int replaceBlank(char[] string, int length)
	{
		String s1 = String.valueOf(string);
		String str = s1.replace(" ","%20");
		StringBuffer sb2 = new StringBuffer("\"");
		sb2.append(str+"\"");
		System.out.println(sb2);
//		string = str.toCharArray();
//		System.out.println(string[3]);
		return str.length();
	 
	}

}
