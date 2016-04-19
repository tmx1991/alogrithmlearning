/*
 * ∞Àª ∫ÛŒ Ã‚
 */
package com.test;

import java.util.Arrays;

public class EigQun
{
	static int num = 8;//∆Â≈Ã∫·◊›
	static int[] location = new int[num];
	static int flag = 0;
	

	public static void main(String[] args) throws ArrayStoreException
	{
		// TODO Auto-generated method stub
		EigQun eq = new EigQun();
		int[][] a = new int[num][num];
	 
		 eq.Queen(0,a);

	}
	
	private void Queen(int m,int a[][]){
		int x,y;
		// System.out.println("-----");
		
		 
		for (x = 0; x < num; x++)
		{   //System.out.println("m="+m+"x="+x);
			Arrays.fill(a[m], 0);
			y= this.Ranks(m, x, a);
			//System.out.println("y="+y);

			if ( y== 0)
			{
				a[m][x] = 1;
				location[m] = x;
			  //	System.out.println("location["+m+"]=="+x);
               if(m==(num-1))
               {
            	   System.out.println("flag="+(++flag));
            	   System.out.println(Arrays.toString(location));
             
               }
               else 
				Queen(m + 1, a);
           
			}

			else
				continue;
		}
		
		
		
	}
	
	private int Ranks(int p,int q,int a[][]){
		int b,c;
	 
		for (b = 0; b < p; b++)
		{
			if (a[b][q] == 1)
			{
            	return -1;
			}
		}
	 
		b = p-1;
		c = q+1;
		while((b >= 0)&&(c<num))
		{
			if (a[b][c] == 1)
			{
  
				return -1;
			}
			
			b--;
			c++;
		}
 
		b = p-1;
		c = q-1;

		while((b >= 0)&&(c>=0))
		{
			if (a[b][c] == 1)
			{
		 
				return -1;
			}
			
			b--;
			c--;
		}

		return 0;

	}

}
