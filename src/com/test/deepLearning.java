package com.test;

public class deepLearning
{

	public static void main(String[] args)
	{
		String str = "asd";
		// for(int i=0;i<20;i++)
		// {
		// str = str + i;
		// }
		//
		//
		// System.out.println(str);
		//
		//
	
		String str1 = "asd";
		str = "asd" + "a";
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(deepLearning.test());
	}
//一下两者结果不一样
	static int test()
	{
		int x = 1;
		try
		{
			return x;
		} finally
		{
			++x;
		}

	}

	static int test2()
	{
		int x = 1;
		try
		{
			return x;
		} finally
		{
			return ++x;
		}

	}
	
	
}
