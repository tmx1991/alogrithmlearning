//归并排序
package commonalgorithms;

public class mergeSort
{
	public static int[] data = {5,2,4,7,1,2,3,6};

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		mergeSort ms=new mergeSort();
		ms.mergeSort(data,1,data.length-1);
		for (int i = 1; i < data.length; i++)
		{
			System.out.print(data[i] + ",");
		}
		

	}
	public void merge(int[] a,int p,int q,int r)
	{
		int[] L=new int[q-p+2];
		int[] R=new int[r-q+1];
		int i=0,j;
		for(i=0;i<q-p+1;i++)
		{
			L[i] = a[p+i];
		}
		for(i=0;i<r-q;i++)
		{
			R[i] = a[q+1+i];
		}
		L[q-p+1]=Integer.MAX_VALUE;
		R[r-q]=Integer.MAX_VALUE;
		
		i=0;
		j = 0;
		for (int k = p; k <= r; k++)
		{
			if (L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			} else
			{
				a[k] = R[j];
				j++;
			}
		}

	}
	public void mergeSort(int[] a,int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
	}

}
