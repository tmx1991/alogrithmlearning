package commonalgorithms;

public class quickSort
{
	public static int[] data = { 0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 70 };//首项不排序

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		quickSort qs = new quickSort();
		qs.quickSort(data, 1, data.length-1);
		
		for (int i = 1; i < data.length; i++)
		{
			System.out.print(data[i] + ",");
		}
		
		System.out.println("第5大的数为："+qs.randomizedSelect(data, 1, data.length-1,5));
		

	}
	
	public void quickSort(int a[],int p,int r)
	{
		if(p<r)
		{
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
		
	}
	
	public int partition(int a[],int p,int r)
	{
		int x = a[r];
		int i=p-1;
		int temp=0;
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=x)
			{
				i++;
				
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp = a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return i+1;
	}
	
	//快速排序找主元的思路，求得第i个顺序统计量
	public int randomizedSelect(int[] a,int p,int r,int i)
	{
		if(p==r)
		{
			return a[p];
		}
		int q = partition(a,p,r);
		int k = q-p+1;
		if(i==k)
			return a[q];
		else if(i<k)
			return randomizedSelect(a,p,q-1,i);
		else 
			return randomizedSelect(a,p+1,r,i-k);
		
	}

}
