package com.test;

import java.util.ArrayList;

public class LinSearchKth
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> num =new ArrayList<Integer>();
		
		num.add(12);
		num.add(9);
		num.add(8);
		num.add(7);
		num.add(555);
		num.add(66);
		num.add(6);
		num.add(90);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(654);
		num.add(65);
		num.add(77);
		//2,3,4,6,7,8,9,12,65,66,77,90,555,654;
		LinSearchKth lsk = new LinSearchKth();
		num.remove(3);
		System.out.println(num.get(3));
		
//		System.out.println(lsk.kthLargestElement(8,num));

	}
	public int kthLargestElement(int k, ArrayList<Integer> numbers)
	{
		int[] data = new int[k];
		int Length= numbers.size();
		System.out.println(Length);
		int j,m,temp;
		data[Length - 1] = numbers.get(0);
		for (int i = 1; i < Length; i++)
		{
			System.out.println("i="+i);
			temp = numbers.get(i);
			j = 0;
			
			if(i<=k)
			{
				for(j=0;j<i;j++)
				{
					while (temp < data[k - j - 1])
					{
						j++;
					}
					
				}
			}
			
			if (j == i)
			{
				data[Length - i - 1] = temp;
			} else
			{
				for (m = 0; m < i-j; m++)
					data[Length - i - 1 + m] = data[Length - i + m];

				data[Length - j -1] = temp;
			}
			
			for(m=0;m<Length;m++)
				System.out.print(data[m]+",");
			System.out.println();

		}

		System.out.println(data[Length-k]);
		return k;

	}

	public int kthLargestElement1(int k, ArrayList<Integer> numbers)
	{ 
		int temp;
		int i = 0,j;
		if(numbers.size()-k>=k)
		{
			for(j=0;j<k;j++)
			{
				for(i=0;i<numbers.size()-j-1;i++)
				{
//					System.out.println("g=="+numbers.get(i));
					if (numbers.get(i) > numbers.get(i + 1))
					{
						temp = numbers.get(i);
						numbers.set(i, numbers.get(i + 1));
						numbers.set(i + 1, temp);
					}
					
				}
				
			}
//			System.out.println(numbers.get(numbers.size()-k).toString());
			return numbers.get(numbers.size()-k);
//			System.out.println("i1="+i);

		}
		
		else
		{
			for(j=0;j<numbers.size()-k+1;j++)
			{
				for(i=numbers.size()-1;i>j;i--)
				{
					
					if (numbers.get(i) < numbers.get(i - 1))
					{
						temp = numbers.get(i);
						numbers.set(i, numbers.get(i - 1));
						numbers.set(i-1, temp);
					}
					
				}
//				System.out.println("g=="+numbers.get(j));
			}
//			System.out.println("i2="+i);
		 return numbers.get(j-1);
		}
		
		  
	}

}
