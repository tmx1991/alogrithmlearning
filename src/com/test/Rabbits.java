/*
 * ���ӷ�ֳ����
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
			return newLit(n-2)+Big(n-1)-newLit(n-12);//�˴���һ�������꣬��������
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
			return Big(n-1)-newLit(n-11)-newLit(n-12);//�˴���5���ʱ�����ڷ�ֳ�ڣ�֮��Ž���
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        float year=(float) 15;
        System.out.println(year+"���");
        Rabbits de = new Rabbits();
       
        System.out.println("����������"+de.Big(2*year));
        System.out.println("С��������"+(de.newLit(2*year)+de.newLit(2*year-1)));
	}

}
