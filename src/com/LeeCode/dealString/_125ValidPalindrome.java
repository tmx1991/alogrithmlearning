package com.LeeCode.dealString;

/**
 * Created by ttt on 2016/4/26.
 */
public class _125ValidPalindrome {

    public static void main(String[] args) {

        String x = "0p";

        _125ValidPalindrome vp = new _125ValidPalindrome();

        System.out.println(vp.isPalindrome(x));


    }

    public boolean isPalindrome(String s) {

        int i, j;

        i = 0;
        j = s.length();

        if (j == 0) return true;
        j--;
        while (i <= j) {
            while (i<s.length()&&((s.charAt(i) < 48)||(s.charAt(i) < 65&&s.charAt(i) >57) || (s.charAt(i) < 97 && s.charAt(i) > 90) || s.charAt(i) > 122)) {
                i++;
            }

            while (i<s.length()&&j>0&&((s.charAt(j) < 48)||(s.charAt(j) < 65&&s.charAt(j) >57)|| (s.charAt(j) < 97 && s.charAt(j) > 90) || s.charAt(j) > 122)) {
                j--;
            }

            if(i>=s.length()||j<0) return true;

            if (i <= j) {
                if (panduan(s.charAt(i), s.charAt(j)) == false) {
                    return false;
                }

                i++;
                j--;
            }


        }


        return true;
    }

    public boolean panduan(char a, char b) {
        int x;

        if(a>48&&a<57) return a-b==0?true:false;
        x = Math.abs(a - b);
        if (x == 32 || x == 0)
            return true;
        else
            return false;
    }
}
