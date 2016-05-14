package com.LeeCode.aboutLinklist;

/**
 * Created by ttt on 2016/5/8.
 */
public class _69Sqrt {
    public static void main(String[] args) {
        _69Sqrt s = new _69Sqrt();
        s.mySqrt(2);
    }

    public int mySqrt(int x) {

        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

}
