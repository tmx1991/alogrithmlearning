package com.LeeCode;

public class PalindromeNumber
{

	public static void main(String[] args)
	{
		PalindromeNumber pn = new PalindromeNumber();
		int number = -12344321;
		pn.isPalindrome(number);
	}

	public boolean isPalindrome(int x)
	{
		if(x<0||(x!=0 && x%10==0)) return false;
		int cach = 0 ;
		while(x>cach)
		{
			cach = cach*10+x%10;
			x=x/10;
		}
			
		
		return (x==cach||x==cach/10);

	}
}
