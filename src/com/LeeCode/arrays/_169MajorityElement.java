package com.LeeCode.arrays;

/**
 * Created by ttt on 2016/6/13.
 */
public class _169MajorityElement {
    public static void main(String[] args) {
        _169MajorityElement me = new _169MajorityElement();

        me.majorityElement(new int[]{1,1,1,2,3,4,4,3,3,33,3,3});


    }

    public int majorityElement(int[] nums) {
        int major = nums[0];
        int majornum = 1;

        int len = nums.length;
        if (len == 1) return major;
        else {
            for (int i = 1; i < len; i++) {
                if (nums[i] == major) majornum++;
                else majornum--;

                if (majornum == 0) {
                    major = nums[i];
                    majornum = 1;
                }
            }
        }
        System.out.println(major);
        return major;
    }
}
