package com.LeeCode;

public class ContainerWithMostWater
{

	public int Area = 0;
	public static void main(String[] args)
	{
		ContainerWithMostWater cwmw = new ContainerWithMostWater();
		int[] h = new int[]{1,2,3,4,5};
		System.out.println(cwmw.maxArea(h));
	}
	   public int maxArea1(int[] height) {
		   if(height.length<=1) return 0;
		   int j=0;
		   for(int i = j+1;j<height.length-1;i++)
		   {  
			    if(height[j] == 0||(i==height.length)) {j++;i = j;continue;}
		        if(height[i] != 0&&(Area < (height[j]+height[i])*(i-j)/2))  
		        {Area = (height[i]+height[j])*(i-j)/2;
		        System.out.println("a="+Area);}
		        System.out.println(i+","+j+","+Area);
		   }
		return Area;
	        
	    }
	   
	   public int maxArea(int[] height) {
		   int len = height.length, low = 0, high = len -1 ;  
		   int maxArea = 0;  
		   while (low < high) {  
		     maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));  
		     if (height[low] < height[high]) {  
		       low++;  
		     } else {  
		       high--;  
		     }  
		   }  
		   return maxArea;  
	   }
}
