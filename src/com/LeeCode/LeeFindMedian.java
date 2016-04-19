package com.LeeCode;

public class LeeFindMedian
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		LeeFindMedian lfm = new LeeFindMedian();
		int[] nums1 = {1};
		int[] nums2 = {1};
		System.out.println("res="+lfm.findMedianSortedArrays(nums1, nums2));

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int i = 0,j=0,m=0;
		int temp1 =0;
		int temp2 =0;
		double temp;
		int l1 = nums1.length,l2=nums2.length;
		int med = (l1+l2)/2+1;
		if(l1==0)
		{
			if (l2 % 2 == 0)
				return ((double)nums2[l2/2]+(double)nums2[l2/2-1])/2;
			else
			return nums2[l2/2];
		}
		if(l2==0)
		{
			if (l1 % 2 == 0)
				return ((double)nums1[l1/2]+(double)nums1[l1/2-1])/2;
			else
			return nums1[l1/2];
		}
		if((l1==1)&&(l2==1))
		{
			return ((double)nums1[0]+(double)nums2[0])/2;
		}
		
		if (nums1[0] > nums1[l1-1])
		{
			while ((i != l1)&&(j<=l1/2))
			{
				temp1  = nums1[i];
				nums1[i] = nums1[l1 - i - 1];
				nums1[l1 - i - 1] = temp1;
				i++;
				j++;
			}
		}

		if (nums2[0] > nums2[l2 - 1])
		{
			i = 0;
			j = 0;

			while (i != l2 && (j <= l2 / 2))
			{
				temp1 = nums2[i];
				nums2[i] = nums2[l2 - i - 1];
				nums2[l2 - i - 1] = temp1;
				i++;
				j++;
			}
		}
		for (i = 0; i < l1; i++)
		{
			System.out.print(nums1[i]);
		}
		System.out.println();
		for (i = 0; i < l2; i++)
		{
			System.out.print(nums2[i]);
		}
		System.out.println();
		i = 0;
		j = 0;
		System.out.println("med="+med);
	 
		
		
		
		while ((m++)<=med)
		{System.out.println("m="+m);
			if(m==(med-1))
			{
				temp1 = (nums1[i]<nums2[j])?nums1[i]:nums2[j];
				
			}
			
			if(m==med)
			{
				
				temp2 = (nums1[i]<nums2[j])?nums1[i]:nums2[j];
				break;
			}
			if (nums1[i] <= nums2[j])
			{ 
				if(i<l1-1)
				{
					i++;
				}

				else
				{
					nums1[i] = nums2[j];
					j++;

				}
			} else
			{
				 
				if (j < l2 - 1)
				{
					j++;
					 
				}	
				else
				{
					nums2[j] = nums1[i];
					i++;
				}
			}
			
	

		}

		System.out.println("temp1=" + temp1 + "," + "temp2=" + temp2);
		if ((l1 + l2) % 2 == 0)
		{
			temp = ((double)temp1 + (double)temp2) / 2;
			System.out.println(temp);
		} else
			temp = temp2;
		System.out.println(temp);
		return temp;

	}

}
