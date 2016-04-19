package com.LeeCode;


public class ReverseInteger
{

	public static void main(String[] args)
	{
		ReverseInteger ri = new ReverseInteger();
		int x= 1534231469;
		
		System.out.println(964132435*10);
		System.out.println(ri.reverse(x));
	}

	public int reverse(int x)
	{
//		char[] st = String.valueOf(x).toCharArray();
//		char temp;
//		int len = st.length;
//		System.out.println(String.valueOf(st));
//		if(x<0)
//		{
//			
//			for (int i = 1; i <=len/2; i++)
//			{
//				temp = st[i];
//				st[i] = st[len - i];
//				st[len - i] = temp;
//			}
//
//		}
//		else
//		{
//			for (int i = 0; i <len/2; i++)
//			{
//				temp = st[i];
//				st[i] = st[len - i -1];
//				st[len - i -1] = temp;
//			}
//		}
//		x = Integer.parseInt(String.valueOf(st));
//	 
//		return x;

	int result = 0;

    while (x!= 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        result = newResult;  
        //溢出直接返回0
        if ((newResult - tail) / 10 != result)
        { return 0; }
        System.out.println("re="+result);
        System.out.println("x="+x);
        x = x / 10;
    }

    return result;

	}
}
