/*
 * 丑数的查询问题
 */
package com.test;

public class LinChouShu
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		LinChouShu lcs = new LinChouShu();
		System.out.println(lcs.kthPrimeNumber(100));

	}

	public long kthPrimeNumber(int k)
	{
		long[] data = new long[k+1];
		if(k==1)
			return 3;
		if(k==2)
			return 5;
		if(k==3)
			return 7;
		
		data[0] = 3;
		data[1] = 5;
		data[2] = 7;
		int T3 = 0;
		int T5 = 0, T7 = 0;
		long a, b, c;
		int i;
		for(i=3;i<k;i++)
		{
			while(data[T3]*3<=data[i-1]&&T3<i)
			{
//				System.out.println("data["+T3+"]*3="+data[T3]*3);
				T3++;
				
			}
			while(data[T5]*5<=data[i-1]&&T5<i)
			{
//				System.out.println("data["+T5+"]*5="+data[T5]*5);
				T5++;
			}
			while(data[T7]*7<=data[i-1]&&T7<i)
			{
//				System.out.println("data["+T7+"]*7="+data[T7]*7);
				T7++;
			}
			
			a=data[T3]*3;
			b=data[T5]*5;
			c=data[T7]*7;
//			System.out.println("a,b,c="+a+","+b+","+c);
			if(a>=c&&b>=c)
			{
				data[i]=c;
			}
			if(a>=b&&c>=b)
			{
				data[i]=b;
			}
			if(b>=a&&c>=a)
			{
				data[i]=a;
			}
	 System.out.println("data["+i+"]="+data[i]);
		}
	 
		return data[i-1];

	}

}
