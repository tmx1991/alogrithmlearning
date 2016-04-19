package com.LeeCode;

public class NumberOfBits
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		NumberOfBits nob  = new NumberOfBits();
		nob.hammingWeight(10);

	}
	 public int hammingWeight(int n) {
		 
		 String a = Integer.toBinaryString(n);
		 System.out.println(a);
		 char s = '1';
		 
		int num=0;
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)==s)
				num++;
			System.out.println(num);
		return num;
	        
	    }

}
