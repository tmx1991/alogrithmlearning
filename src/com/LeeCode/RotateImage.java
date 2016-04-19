package com.LeeCode;

public class RotateImage
{

	public static void main(String[] args)
	{
		RotateImage ri = new RotateImage();
		int[][] m = new int[][] { { 1, 2,3,4 }, {  4,5,6,5 } ,
				{ 6,7,6,7},{ 6,7,6,8}
				};

		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m.length; j++)
			{
				System.out.print(m[i][j] + ",");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		ri.rotate(m);
	}

	public void rotate(int[][] matrix)
	{
		int len = matrix.length;
		int temp;

		for (int i = 0; i <=(len-1)/2; i++)
			for (int j = 0; j < len/2; j++)

			{
				temp = matrix[i][j];
 
				matrix[i][j] = matrix[len - 1 - j][i];
 
				matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
 
				matrix[len - 1 - i][len - 1 - j] =matrix[j][len - 1 - i];
 
				matrix[j][len - 1 - i] = temp;
 
				for (int r= 0; r < len; r++)
				{
					for (int s = 0; s < len;s++)
					{
						System.out.print(matrix[r][s] + ",");

					}
					System.out.println();
				}
				System.out.println("-------------");
			}

		for (int i = 0; i < len; i++)
		{
			for (int j = 0; j < len; j++)
			{
				System.out.print(matrix[i][j] + ",");

			}
			System.out.println();
		}
	}

}
