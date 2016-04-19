package com.LeeCode;
 
public class MyPow
{

	public static void main(String[] args)
	{
		MyPow mp = new MyPow();
		double x=2.5;
		int n=4;
		System.out.println(mp.myPow(x, n));

	}
	 public double myPow(double x, int n) {
		 if(n == 0)
	            return 1;
	        if(n<0){
	            n = -n;
	            x = 1/x;
	        }
	        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
	    }
}
