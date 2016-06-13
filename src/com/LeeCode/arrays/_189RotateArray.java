package com.LeeCode.arrays;

/**
 * Created by ttt on 2016/6/13.
 */
public class _189RotateArray {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7};

        int x = 4;

        _189RotateArray ra = new _189RotateArray();

        ra.rotate(data, x);

        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + ",");
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(len == 0) return;

        k = k%len;

        if ( len <= k) return;
        else {
            reverse(nums, 0, len - k - 1);
            reverse(nums, len - k, len - 1);
            reverse(nums, 0, len - 1);
        }


    }

    public void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
}
