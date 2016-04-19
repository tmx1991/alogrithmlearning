/*
 * 堆排序
 */
package commonalgorithms;

public class heapSort
{

	public int heapSize;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] data = { 0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };//首项不排序
		int[] res = new int[data.length];
		heapSort hs = new heapSort();
		res = hs.heapSort(data);

		for (int i = 1; i < data.length; i++)
		{
			System.out.print(res[i] + ",");
		}

	}

	// 排序从a[1]开始
	// 维护最大堆
	public void maxHeapify(int a[], int i)
	{
		int l = 2 * i;
		int r = l + 1;
		int temp = 0;

		int largest = i;
		// int heapSize = a.length-1;
		if ((l <= heapSize) && (a[l] > a[i]))
		{
			largest = l;
		} else
			largest = i;

		if ((r <= heapSize) && (a[r] > a[largest]))
		{
			largest = r;
		}

		if (largest != i)
		{// 交换父子结点，交换后的子结点继续递归
			temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest);

		}
	}

	// 创建最大堆
	public void buildMaxHeap(int a[])
	{
		heapSize = a.length - 1;
		for (int i = (a.length - 1) / 2; i > 0; i--)
		{
			maxHeapify(a, i);
		}
	}

	// 堆排序算法
	public int[] heapSort(int a[])
	{
		int temp = 0;
		buildMaxHeap(a);

		for (int i = a.length - 1; i >= 2; i--)
		{
			temp = a[i];
			a[i] = a[1];
			a[1] = temp;

			heapSize--;
			maxHeapify(a, 1);
		}

		return a;
	}

}
