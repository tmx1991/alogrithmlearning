package com.companiestests;

/**
 * 求子数组的最大和
 * Created by ttt on 2016/4/19.
 */
public class maxSubarray {
    public static void main(String[] args) {

        maxSubarray ms = new maxSubarray();

        int[] data = new int[]{1, -2, 3, 10, -4, 7, 2, -5};

        System.out.println(ms.maxSubarray(data));
    }

    //考虑连续最大相加不会超过0
    private int maxSubarray(int[] array)
    {
        int len = array.length;
        int max = array[0];
        int sum = 0;

        for(int i=1;i<len;i++)
        {
            sum = sum + array[i];

            if(sum >max)
                max = sum;
            else if(sum<0)
                sum = 0;
            else
            {
                //什么也不做
            }
        }
        return max;
    }
}
