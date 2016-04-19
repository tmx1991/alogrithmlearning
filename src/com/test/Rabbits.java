/*
 * 兔子繁殖问题
 */
package com.test;

public class Rabbits {
	
	private float Big(float n)
	{
		if(n <= 0)
		{
			return 0;
		}

		else
		{
			return newLit(n-2)+Big(n-1)-newLit(n-12);//此处，一旦到六年，兔子死亡
		}
	
		
	}
	
	private float newLit(float n)
	{
		if(n == 0)
		{
			return 1;
		}
		else if(n<0)
		{
			return 0;
		}
		else
		{
			return Big(n-1)-newLit(n-11)-newLit(n-12);//此处，5年的时候仍在繁殖期，之后才结束
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        float year=(float) 15;
        System.out.println(year+"年后");
        Rabbits de = new Rabbits();
       
        System.out.println("大兔子数："+de.Big(2*year));
        System.out.println("小兔子数："+(de.newLit(2*year)+de.newLit(2*year-1)));
	}

}
