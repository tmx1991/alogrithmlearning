/*
 * 计数排序，首先要知道最大值
 */
package commonalgorithms;

public class countSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] data = {2,5,3,0,2,3,0,3};
		int[] res = new int[data.length];
		countSort cs =new countSort();
		cs.countSort(data, res, 5);
		
		for (int i = 1; i < data.length; i++)
		{
			System.out.print(res[i] + ",");
		}

	}
	
	public int[] countSort(int[] a,int[] b,int k)
	{
		int[] c = new int[k + 1];
		int i = 0;
		int j = 0;
		for (i = 0; i <= k; i++)
		{
			c[i] = 0;
		}

		for (j = 0; j < a.length; j++)
		{
			c[a[j]] = c[a[j]] + 1;
		}

		for (i = 1; i <= k; i++)
		{
			c[i] = c[i] + c[i - 1];
		}

		for (j = a.length - 1; j >= 0; j--)
		{
		 
			b[c[a[j]]-1] = a[j];
			c[a[j]]--;
		}

		return b;

	}

}
