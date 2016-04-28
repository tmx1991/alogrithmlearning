package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/28.
 */
public class _29DivideTwoIntegers {

    public static void main(String[] args) {

        int a = 2,b;
        a= a<<2;

        _29DivideTwoIntegers dtt = new _29DivideTwoIntegers();

        a = -2;
        b = -1;
        System.out.println(dtt.divide(a,b));

    }
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            sign = -1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);


        if (ldivisor == 0) return Integer.MAX_VALUE;
        if ((ldividend == 0) || (ldividend < ldivisor)) return 0;

        if(ldividend<ldivisor) return 0;
        System.out.println("l="+ldivisor+","+ldividend);
        long sum = ldivisor;
        long multiple = 0;
        while (sum <= ldividend)
        {
            sum = sum +ldivisor;
            multiple++;
        }

        System.out.println("m="+multiple);
        int ans;
        if (multiple > Integer.MAX_VALUE){ //Handle overflow.
            ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            ans = (int) (sign * multiple);
        }
        return ans;
    }
}
