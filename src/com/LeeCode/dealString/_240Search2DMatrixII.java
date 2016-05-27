package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/5/27.
 */
public class _240Search2DMatrixII {
    public static void main(String[] args) {
        int[][] data = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int t = 13;
        _240Search2DMatrixII smii = new _240Search2DMatrixII();

        System.out.println(smii.searchMatrix(data,t));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0) return false;

        int l = matrix.length-1;
        int m = matrix[0].length-1;
        int i = 0;
        int j = m;

        while(i<=l && j>=0)
        {
            if(matrix[i][j]>target)
                j--;
            else if(matrix[i][j]<target)
                i++;
            else
                return true;
        }
        return false;
    }
}
