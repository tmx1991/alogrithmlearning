package com.Sorts;

public class Sorts
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = {0,2,1,5,6,48,8,9,66,4,5};
		Sorts ss =new Sorts();
		ss.InsertSort(nums);

	}

	public void InsertSort(int[] data)
	{
		int temp = 0;
		int i,j;
		System.out.println("asd");
		//首位不排序
		for ( i = 2; i < data.length; i++)
		{
			if (data[i] < data[i - 1])
			{
				data[0] = data[i];
				for (j = i - 1;data[0] < data[j]; j--)
				{
					data[j + 1] = data[j];

				}
				data[j + 1] = data[0];
			}
		}
		i=0;
		while (i < data.length)
		{
			System.out.print(data[i++] + ",");
		}

	}
	
	

}
