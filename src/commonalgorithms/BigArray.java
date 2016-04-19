/*
 * 最大子数组问题
 */
package commonalgorithms;

public class BigArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array0 = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int[] Res = new int[3];
		BigArray ba = new BigArray();
		Res = ba.findMaximumSubarray(array0, 0, array0.length-1);
		
		System.out.println(Res[0]+","+Res[1]+","+Res[2]);

	}

	public int[] findMaxCrossingSubarray(int a[], int low, int mid, int high)
	{
		int[] crossRes = new int[3];
		int leftSum = Integer.MIN_VALUE;
		int maxLeft = mid;
		int sum = 0;
		for(int i=mid;i>=0;i--)
		{
			sum = sum +a[i];
			if(sum>leftSum)
			{
				leftSum = sum;
				maxLeft=i;
			}
		}
		
		int rightSum = Integer.MIN_VALUE;
		int maxRight = mid+1;
		sum = 0;
		for(int j=mid+1;j<=high;j++)
		{
			sum = sum +a[j];
			if(sum>rightSum)
			{
				rightSum = sum;
				maxRight=j;
			}
		}
		
		
		crossRes[0] = maxLeft;
		crossRes[1] = maxRight;
		crossRes[2] = leftSum+rightSum;

		return crossRes;
	}

	public int[] findMaximumSubarray(int a[], int low, int high)
	{
		int[] Res = new int[3];
		
		int[] ResLeft = new int[3];
		int[] ResRight = new int[3];
		int[] ResCross = new int[3];
		if(low == high)
		{
			Res[0] = low;
			Res[1] = high;
			Res[2] = a[0];
			return Res;
		}
		else
		{
			int mid = (low+high)/2;
			ResLeft = findMaximumSubarray(a, low, mid);
			ResRight = findMaximumSubarray(a, mid+1, high);
			ResCross = findMaxCrossingSubarray(a, low, mid,high);
			
			if((ResLeft[2]>=ResRight[2])&&(ResLeft[2]>=ResCross[2]))
			{
				return ResLeft;
			}
			else if((ResRight[2]>=ResLeft[2])&&(ResRight[2]>=ResCross[2]))
			{
				return ResRight;
			}
			else
			{
				return ResCross;
			}
			
		}
	}

}










