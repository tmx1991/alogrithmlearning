package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/22.
 */
public class _342PowerofFour {
    public static void main(String[] args) {
        _342PowerofFour pf = new _342PowerofFour();

        System.out.println(Integer.MIN_VALUE);
        pf.isPowerOfFour(4);
    }
    public boolean isPowerOfFour(int num) {
        return Integer.toString(num, 4).matches("10*");
    }
}
