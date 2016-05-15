package com.LeeCode.dynamicprogramming;

/**
 * Created by ttt on 2016/5/14.
 */
public class _62UniquePaths {

    public static void main(String[] args) {
        _62UniquePaths up = new _62UniquePaths();

        up.uniquePaths(7,3);
    }
    public int uniquePaths(int m, int n) {
        int[][] nums = new int[m][n];
        int i=0,j=0;
        if(m==1&&n==1) return 1;

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0&&j==0)  nums[0][0] = 1;
                else
                nums[i][j] = ((i-1<0)?0:nums[i-1][j])+((j-1<0)?0:nums[i][j-1]);
            }
        }

        System.out.println("test="+nums[i-1][j-1]);
        return nums[i-1][j-1];


    }
}
