package com.LeeCode;
/**
 * 判断一串数字吗能否被解码为A-Z,若能，则有多少种被解码的方法
 * @author ttt
 *
 */
public class _91DecodeWays
{

	public static void main(String[] args)
	{
		_91DecodeWays dw = new _91DecodeWays();

		System.out.println(dw.numDecodings("123415"));
	}

	public int numDecodings2(String s)
	{
		 
//		System.out.println(s.charAt(0)-48);
//		System.out.println(s.charAt(2)-'0');//注意此处为0的ascii码
//		System.out.println(s.charAt(1)-65);
//		System.out.println(Integer.parseInt(s.substring(2, 4)));
		return 0;

	}
	  public int numDecodings1(String s) {
	        int n = s.length();
	        if (n == 0) return 0;

	        int[] memo = new int[n+1];
	        memo[n]  = 1;
	        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

	        for (int i = n - 2; i >= 0; i--)
	            if (s.charAt(i) == '0') continue;
	            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

	        return memo[0];
	    }
	  public int numDecodings(String s) {
		    int result = 0;
		    if(s == null || s.length() == 0)
		        return 0;
		    if(s.length() == 1 && s.charAt(0) >= '1' && s.charAt(0) <= '9')
		        return 1;
		    if(s.charAt(0) == '0')
		        return 0;
		    int f0 = 1;
		    int f1 = 1;
		    for(int i=1;i<s.length();i++)
		    {
		        int temp = f1;
		        int number =  0;
		        number =  number*10 + (s.charAt(i-1)-'0');
		        number =  number+ (s.charAt(i) -'0');
		        if(number == 20 || number == 10) // "00", "30"..."90" are not accepted
		            f1 = f0;
		        else if(number%10 == 0&&number/10>2) // "00", "30"..."90" are not accepted
		            return 0;
		        else if(number <=26 && number>10)
		            f1 = f1+f0;//单个数字解码是一种，两个数字解码是一种
		        f0 = temp;
		    }
		    return f1;
		}
}
